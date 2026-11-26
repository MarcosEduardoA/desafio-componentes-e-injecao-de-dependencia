# Desafio: Componentes e Injeção de Dependência (DevSuperior)

Projeto desenvolvido em Java com Spring Boot como solução para o desafio de **Componentes e Injeção de Dependência** da formação Java Spring (DevSuperior).

## Sobre o projeto

O sistema calcula o valor total de um pedido a partir de três dados de entrada: **código do pedido**, **valor básico** e **porcentagem de desconto**. O cálculo aplica o desconto sobre o valor básico e adiciona o valor do frete conforme a faixa de preço abaixo:

| Valor básico do pedido (sem desconto) | Frete |
| :--- | :--- |
| Abaixo de R$ 100.00 | R$ 20.00 |
| De R$ 100.00 até R$ 200.00 exclusive | R$ 12.00 |
| R$ 200.00 ou mais | Grátis |

## Exemplos de entrada e saída

### Exemplo 1
**Entrada:**
```text
1034
150.00
20.0