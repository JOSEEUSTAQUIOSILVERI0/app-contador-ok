Contador Android
Este é um projeto simples de aplicativo Android desenvolvido em Kotlin que implementa um contador. O aplicativo permite ao usuário aumentar ou diminuir o valor do contador através de botões, com uma interface simples e controles para evitar que o contador tenha valores negativos.

Funcionalidades
Exibir contador: Mostra o valor atual do contador.
Botão de Aumentar: Incrementa o valor do contador em 1 a cada clique.
Botão de Diminuir: Decrementa o valor do contador em 1 a cada clique, mas desativa-se quando o contador está em zero para evitar valores negativos.
Captura de Tela
![image](https://github.com/user-attachments/assets/748f0571-f564-4159-924b-c4c6b65481ae)


Estrutura do Projeto
Arquivo activity_main.xml
Este arquivo define a interface do usuário, incluindo:

Um TextView centralizado para exibir o valor do contador.
Dois botões abaixo do contador: "Aumentar" e "Diminuir".

Arquivo MainActivity.kt
Este arquivo contém a lógica do aplicativo:

A variável counter armazena o valor do contador.
O botão "Aumentar" incrementa o contador e habilita o botão "Diminuir" quando o valor é maior que zero.
O botão "Diminuir" decrementa o contador, desativando-se ao alcançar zero.
kotlin

Clone o repositório:



Abra o projeto no Android Studio.
Conecte um dispositivo físico ou use o emulador para rodar o aplicativo.
Como Usar
Aumentar o contador: Clique no botão "Aumentar" para incrementar o valor.
Diminuir o contador: Clique no botão "Diminuir" para reduzir o valor. O botão fica desativado quando o contador atinge zero.
Tecnologias Usadas
Kotlin: Linguagem de programação para desenvolvimento Android.
Android Studio: IDE para desenvolvimento Android.
XML: Usado para definir a interface de usuário.
