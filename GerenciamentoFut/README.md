# ⚽ Gestão de Times de futebol

[![Java](https://img.shields.io/badge/Java-17%2B-orange?style=for-the-badge&logo=java)](https://www.oracle.com/java/)
[![License](https://img.shields.io/badge/License-MIT-blue?style=for-the-badge)](LICENSE)
[![Status](https://img.shields.io/badge/Status-Conclu%C3%ADdo-brightgreen?style=for-the-badge)](#)

> Sistema acadêmico em Java focado na aplicação prática dos pilares da **Programação Orientada a Objetos (POO)** e boas práticas de **encapsulamento**, desenvolvido para o gerenciamento completo de elencos, histórico de partidas e estatísticas de um clube de futebol.

---

## 📌 Sobre o Projeto

O projeto simula a estrutura operacional de um clube de futebol, permitindo o controle de atletas, registro de resultados de partidas e o cálculo automático de métricas e estatísticas do time. 

### 🎯 Principais Destaques do Código
* **Encapsulamento Rígido:** Atributos protegidos por modificadores `private` com controle de acesso rigoroso via Getters/Setters seletivos.
* **Integridade de Dados:** Métodos de mutação controlada (ex: `adicionarGols()` com verificação de valores negativos) para evitar inconsistências no estado dos objetos.
* **Imutabilidade Estratégica:** Registro de histórico de partidas estruturado para preservação de dados contábeis.
* **Uso de Convencionados `is`:** Métodos booleanos na verificação de regras de negócio para tornar o código fluido e legível.

---

## 🏗️ Arquitetura do Sistema

O projeto é estruturado em três classes principais interconectadas:

| Classe | Responsabilidade |
| :--- | :--- |
| **`Jogador`** | Representa o atleta (entidade), armazenando nome, posição, gols marcados e partidas jogadas. |
| **`Partida`** | Registra o histórico individual de cada jogo (oponente, placar e data) com avaliação booleana de resultados. |
| **`TimeFutebol`** | Classe controladora responsável pela gestão de listas (`ArrayList`), registro de jogos e computação estatística do elenco. |

---

## 🚀 Funcionalidades

- [x] **Gestão de Elenco:** Adicionar e remover jogadores do time dinamicamente.
- [x] **Registro de Jogos:** Cadastrar partidas com atualização automática do histórico e do saldo de jogos dos atletas.
- [x] **Estatísticas Globais:** Cálculo consolidado de vitórias, empates, derrotas e total de jogos disputados.
- [x] **Consultas Especiais:**
  - Identificação do **artilheiro** do elenco.
  - Identificação do **jogador com mais partidas** disputadas.
- [x] **Listagem:** Exibição formatada do elenco completo do clube.

---

## 💻 Como Executar

### Pré-requisitos
* **Java JDK** 17 ou superior instalado.
* IDE de sua preferência (VS Code, IntelliJ IDEA, Eclipse) ou terminal de comando.

### Passos
1. **Clone o repositório:**
   ```bash
   git clone [https://github.com/seu-usuario/gestao-time-futebol-java.git](https://github.com/seu-usuario/gestao-time-futebol-java.git)
