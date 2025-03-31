# SOLID - Princípio da Responsabilidade Única (SRP) em Java

## 📖 O que é o SRP?

O **Princípio da Responsabilidade Única (SRP - Single Responsibility Principle)** é o primeiro princípio do SOLID e estabelece que:

> ***Uma classe deve ter apenas um motivo para mudar.***

Isso significa que cada classe deve ser responsável por **apenas uma funcionalidade** do sistema. Quando uma classe possui múltiplas responsabilidades, ela se torna mais difícil de manter, testar e reutilizar.

### ❌ Problemas de violar o SRP:
- Código difícil de entender e modificar.
- Alta dependência entre funcionalidades diferentes.
- Aumento do risco de bugs ao alterar o código.

### ✅ Benefícios de aplicar o SRP:
- Código mais modular e reutilizável.
- Melhor organização e separação de responsabilidades.
- Facilidade na manutenção e expansão do software.


Cada **case** apresenta um problema comum que viola o SRP dentro do pacote `problem` e uma solução dentro do pacote `solution`.

## 🏆 Objetivo

- **Identificar e corrigir** violações do SRP.
- **Melhorar a separação de responsabilidades** dentro do código.
- **Aprimorar o design de software**, tornando-o mais modular e manutenível.

## 📌 Explicação de Cada Case

### 📝 **Case 1 - Gestão de Funcionários**
#### ❌ Problema:
A classe `Employee` tem múltiplas responsabilidades:
- Gerencia dados do funcionário.
- Salva os dados do funcionário no banco de dados.
- Gera relatórios sobre os funcionários.

Isso viola o SRP, pois essa classe pode mudar por diferentes motivos, tornando a manutenção difícil.

#### ✅ Solução:
O problema foi resolvido separando as responsabilidades:
- `Employee.java`: Mantém apenas os dados do funcionário.
- `EmployeeRepository.java`: Responsável por salvar o funcionário no banco de dados.
- `EmployeeReport.java`: Responsável por gerar relatórios sobre os funcionários.

---

### 💰 **Case 2 - Fatura e Envio de E-mail**
#### ❌ Problema:
A classe `Invoice` tem múltiplas responsabilidades:
- Calcula o valor total da fatura.
- Salva a fatura no banco de dados.
- Envia a fatura por e-mail ao cliente.

Isso viola o SRP, pois são responsabilidades distintas que devem ser separadas.

#### ✅ Solução:
O problema foi resolvido dividindo as responsabilidades:
- `Invoice.java`: Apenas representa a fatura e realiza cálculos.
- `InvoiceRepository.java`: Responsável por salvar a fatura no banco de dados.
- `InvoiceEmailSender.java`: Responsável pelo envio da fatura por e-mail.

---

### 📦 **Case 3 - Processamento de Pedidos**
#### ❌ Problema:
A classe `Order` tem múltiplas responsabilidades:
- Gerencia os dados do pedido.
- Calcula o valor total do pedido.
- Processa o pagamento do pedido.
- Envia uma notificação ao cliente.

Isso viola o **SRP**, pois são responsabilidades distintas.

#### ✅ Solução:
O problema foi resolvido separando as responsabilidades:
- `Order.java`: Apenas representa um pedido e calcula o total.
- `PaymentProcessor.java`: Responsável por processar o pagamento.
- `EmailService.java`: Responsável pelo envio de e-mails.

Isso melhora a organização do código, facilitando manutenção, testes e reuso.

---

### 📊 **Case 4 - Relatório de Vendas**
#### ❌ Problema:
A classe `SalesReport` tem múltiplas responsabilidades:
- Gera o relatório de vendas.
- Exporta o relatório para um arquivo CSV.
- Exibe o relatório no console.

Isso viola o **SRP**, pois a classe deveria se preocupar apenas com a geração dos dados do relatório e não com a forma como eles serão exibidos ou armazenados.

#### ✅ Solução:
O problema foi resolvido separando as responsabilidades:
- `SalesReport.java`: Responsável apenas por armazenar e gerar os dados do relatório.
- `CSVExporter.java`: Responsável por exportar o relatório para CSV.
- `ReportPrinter.java`: Responsável por exibir o relatório no console.

Isso melhora a organização do código, facilitando manutenção, testes e reuso.

---

## 🚀 Como Usar

1. Explore os **cases** dentro do diretório `src/`.
2. Analise o código dentro do subpacote `problem/` para entender a violação do SRP.
3. Compare com o código no subpacote `solution/`, onde a responsabilidade foi separada corretamente.
4. Execute os exemplos no `Main.java` de cada case para visualizar o comportamento antes e depois da refatoração.

---

⚡ Desenvolvido para praticar **SOLID** e boas práticas de programação em **Java**.

---

## 👨‍💻 Autor
Danilo Takeo Kanizawa
