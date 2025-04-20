# 📇 Contact Manager - Kotlin (Console)

Este é um projeto simples de gerenciamento de contatos feito em **Kotlin puro**, com foco em praticar a sintaxe da linguagem, lógica de programação, e o uso de recursos idiomáticos da linguagem como `data class`, funções de alta ordem, lambdas, e manipulação de coleções.

## 🧠 Objetivo

O projeto simula um pequeno sistema de agenda de contatos em memória, onde é possível:

- ✅ Cadastrar novos contatos
- ✅ Listar todos os contatos
- ✅ Buscar um contato pelo nome (case-insensitive)
- ✅ Atualizar o telefone de um contato
- ✅ Remover um contato da agenda

## 📦 Tecnologias utilizadas

- [Kotlin](https://kotlinlang.org/) — Linguagem principal

> Este projeto **não utiliza nenhuma biblioteca externa** e roda diretamente no terminal/IDE.

## 📁 Estrutura

O código está estruturado com clareza e foco em boas práticas. Principais elementos:

- `Contact.kt` – Define a `data class` para representar um contato
- `ContactManager.kt` – Classe responsável por gerenciar os contatos (add, list, update, delete)
- `Main.kt` – Ponto de entrada do programa, com um menu interativo simples via terminal

## 🚀 Como executar

1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/contact-manager-kotlin.git
   cd contact-manager-kotlin

2. Abra o projeto em uma IDE como IntelliJ IDEA ou use o Kotlin Playground

3. Execute o arquivo Main.kt

📚 Aprendizados
Este projeto reforça os seguintes conceitos:

Uso de data class e encapsulamento

Manipulação de listas e funções funcionais (map, filter, firstOrNull, etc.)

Boas práticas com null safety

Criação de funções reutilizáveis e expressivas

Sintaxe idiomática do Kotlin

🤝 Contribuição
Sinta-se à vontade para dar sugestões ou abrir issues com melhorias! Este é um projeto de aprendizado e prática contínua.