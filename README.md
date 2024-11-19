## **1º-Documento de Levantamento de Requisitos**

**Projeto**: Gerenciador de Hardware para Laboratórios

**Data**: 24/10/2024

**Responsável**: 

Laerte Ferraz Da Silva Junior e Vinicius Costa Dias
---

### **1. Introdução**

Este é um projeto criado em virtude do aprendizado sobre o funcionamento organizado de um ambiente tecnológico, organizando não somente materiais tecnológicos, mas também a forma que são aplicadas as manutenções, assim como a otimização do desempenho e custos, desempenhando um papel crucial na sustentabilidade e eficiência das infraestruturas tecnológicas.

### **1.1. Objetivo**

O Objetivo desse projeto é aprender mais sobre MySQL e java, através da criação de um sistema com o propósito de Gerenciar um sistema de hardware, através dos requisitos funcionais e não funcionais, como por exemplo, cadastro de usuarios, controle de máquinas, controle de consertos, manutenções, inventário de peças, equipamentos, gerenciamento de laboratórios e controle de acesso e usuários.   

### **1.2. Escopo**

O sistema deve gerenciar: 

Cadastro de usuarios
Controle de máquinas
Controle de consertos
Manutenções
Inventário de peças
Equipamentos
Gerenciamento de laboratórios
Controle de acesso e usuários

### **1.3. Definições, Acrônimos e Abreviações**

Definições

Requisitos Funcionais (RF): São as funcionalidades que o sistema ou projeto deve ter para atender às necessidades do usuário. Ex: "O sistema deve permitir o cadastro de equipamentos."
Requisitos Não Funcionais (RNF): São as características do sistema relacionadas à sua qualidade, como desempenho, segurança e usabilidade. Ex: "O sistema deve ser capaz de processar até 50 usuários simultâneos."
Escopo: O conjunto de atividades, funcionalidades e entregáveis que estão incluídos ou excluídos de um projeto. Define os limites do trabalho.
Stakeholders: São as partes interessadas em um projeto, como clientes, usuários, patrocinadores ou membros da equipe.

Acrônimos

API (Application Programming Interface): Interface que permite que diferentes softwares se comuniquem entre si.
CRM (Customer Relationship Management): Sistema para gerenciar o relacionamento com os clientes.
ERP (Enterprise Resource Planning): Sistema de gestão empresarial que integra todas as funções da empresa, como finanças, logística e recursos humanos.
UI (User Interface): Interface do usuário, o meio pelo qual o usuário interage com um sistema ou aplicativo.
UX (User Experience): Experiência do usuário, que refere-se a como o usuário se sente ao interagir com um sistema ou produto.

Abreviações

HR (Hardware): Equipamento físico de um computador ou sistema.
DB (Database): Banco de dados, onde as informações são armazenadas de maneira estruturada.
OS (Operating System): Sistema operacional, que gerencia os recursos de hardware e software de um computador.
IoT (Internet of Things): Internet das coisas, que se refere à interconexão de dispositivos e objetos físicos à internet.

---

### **2. Requisitos Funcionais**

### **2.1. Cadastro de Máquinas**

- **RF-01**: O sistema deve permitir o cadastro de máquinas, incluindo suas especificações de hardware (CPU, RAM, armazenamento).
O sistema permite o cadastro de máquinas, incluindo especificações de hardware.
- **RF-02**: O sistema deve permitir a associação de cada máquina a um laboratório específico.
O sistema permite a associaão de cada máquina ao laboratório.
- **RF-03**: O sistema deve exibir o status atual da máquina (funcionando, em manutenção, fora de uso).
O sistema exibe o status atual da maquina  
### **2.2. Controle de Consertos e Manutenções**

- **RF-04**: O sistema deve permitir registrar manutenções corretivas e preventivas realizadas em uma máquina.
  O sistema permite registrar manutenções corretivas e preventivas.
- **RF-05**: O sistema deve permitir associar peças utilizadas no conserto à respectiva manutenção.
- O sistema permite associar peças utilizadas no conserto à respectiva manutenção.
- **RF-06**: O sistema deve armazenar um histórico completo de todas as manutenções realizadas em cada máquina.
  O sistema armazena o histórico completo de todas as manutenções realizadas nas maquinas.
- **RF-07**: O sistema deve permitir a criação de agendamentos de manutenções preventivas para as máquinas.
O sistema permite a criação de agendamentos de manutenções preventivas para máquinas
### **2.3. Controle de Peças e Inventário**

- **RF-08**: O sistema deve permitir o cadastro de peças de hardware no inventário, incluindo informações como tipo, fabricante e quantidade em estoque.
  O sistema permite o cadastro de peças de hardware no inventário, inclui informações do tipo, fabricante e quantidade em estoque.
- - **RF-09**: O sistema deve registrar as peças retiradas do estoque para serem utilizadas em consertos.
  O sistema registra as peças retiradas do estoque para serem utilizadas em consertos.
- **RF-10**: O sistema deve emitir alertas quando uma peça estiver com baixa quantidade no estoque.
  O sistema emite os alertas quando uma peça esta com baixa quantidade no estoque.
### **2.4. Gerenciamento de Laboratórios**

- **RF-11**: O sistema deve permitir gerenciar múltiplos laboratórios, associando máquinas e peças a seus respectivos locais.
O sistema permite gerenciar múltiplos laboratórios, associando máquinas e peças a seus respectivos locais.
- **RF-12**: O sistema deve exibir um painel geral que mostre o status das máquinas em todos os laboratórios.
O sistema exibe um painel geral que mostra o status das máquinas em todos os laboratórios.
### **2.5. Relatórios e Auditorias**

- **RF-13**: O sistema deve gerar relatórios de consertos e manutenções realizados em um período definido.
- O sistema gera relatórios de consertos e manutenções realizados em um período definido.
- **RF-14**: O sistema deve gerar relatórios sobre o uso e troca de peças ao longo do tempo.
- O sistema gera relatórios sobre o uso e troca de peças ao longo do tempo.
- **RF-15**: O sistema deve permitir a exportação de relatórios em formatos como PDF ou Excel.
O sistema permite a exportação de relatórios em formatos como PDF ou Excel.
### **2.6. Controle de Acesso e Usuários**

- **RF-16**: O sistema deve permitir a criação de perfis de usuário com diferentes níveis de acesso (técnicos, administradores).
- O sistema permite a criação de perfis de usuário com diferentes níveis de acesso.
- **RF-17**: O sistema deve manter logs de todas as ações realizadas pelos usuários.
  O sistema mantem logs de todas as ações realizadas pelos usuários.
- ### **3. Requisitos Não Funcionais**

### **3.1. Desempenho**

- **RNF-01**: O sistema deve ser capaz de processar e exibir informações de até 1000 máquinas e peças de hardware sem perda significativa de desempenho.
O sistema é capaz de processar e exibir informações de até 1000 máquinas e peças de hardware sem perda significativa de desempenho
### **3.2. Usabilidade**

- **RNF-02**: O sistema deve possuir uma interface intuitiva, facilitando o registro de manutenções e o gerenciamento de inventário por técnicos.
O sistema possui uma interface intuitiva, facilitando o registro de manutenções e o gerenciamento de inventário por técnicos.
### **3.3. Confiabilidade**

- **RNF-03**: O sistema deve manter backup automático dos dados cadastrados a cada 24 horas.
O sistema mantem backup automático dos dados cadastrados a cada 24 horas.
### **3.4. Portabilidade**

- **RNF-04**: O sistema deve ser multiplataforma, funcionando em ambientes Windows, Linux e macOS.
O sistema é multiplataforma, funcionando em ambientes Windows, Linux e macOS.
### **3.5. Segurança**

- **RNF-05**: O sistema deve garantir o controle de acesso por meio de autenticação de usuário.
  O sistema garante o controle de acesso por meio de autenticação de usuário.
- **RNF-06**: Todas as ações dos usuários devem ser registradas para auditoria futura.
  As ações dos usuários são registradas para auditoria futura.
- ### **4. Requisitos de Interface**

### **4.1. Interface Gráfica**

- **RI-01**: O sistema deve ter uma interface gráfica baseada em JavaFX ou Swing.
- O sistema tem uma interface gráfica baseada em JavaFX ou Swing.
- **RI-02**: O sistema deve exibir gráficos de desempenho de máquinas e peças através de bibliotecas como JFreeChart.
O sistema exibe gráficos de desempenho de máquinas e peças através de bibliotecas como JFreeChart.
### **4.2. Relatórios**

- **RI-03**: O sistema deve permitir a geração de relatórios em tempo real, com filtros de data, laboratório ou máquina específica.
O sistema permite a geração de relatórios em tempo real, com filtros de data, laboratório ou máquina específica.
### **5. Considerações Finais**

O sistema "Gerenciador de Hardware para Laboratórios" deve facilitar o controle e o monitoramento das máquinas e peças de hardware, proporcionando maior eficiência na gestão de manutenção e inventário dos laboratórios. Este documento deverá ser revisado periodicamente conforme novas funcionalidades e necessidades sejam identificadas.
```
Create database GerenciadoHardware;

use GerenciadoHardware;
 

CREATE TABLE usuario ( 

id_usuario INT AUTO_INCREMENT PRIMARY KEY, 
nome VARCHAR(100) NOT NULL, 
senha VARCHAR(100) NOT NULL, 
tipo_user varchar(30)

);

SELECT * FROM usuario;

describe usuario;



CREATE TABLE laboratorios ( 

id_laboratorio INT AUTO_INCREMENT PRIMARY KEY, 

nome VARCHAR(100) NOT NULL 

);

SELECT * FROM laboratorios;

CREATE TABLE equipamentos ( 

id_equipamento INT AUTO_INCREMENT PRIMARY KEY, 
 
nome_maquina VARCHAR(100) NOT NULL, 
 
status VARCHAR(100) NOT NULL,
 
tipo VARCHAR(100)  
 
 );

SELECT * FROM equipamentos;

-- CREATE TABLE manutencao ( 

-- id_manutencao INT AUTO_INCREMENT PRIMARY KEY, 

-- id_equipamento INT, data_manutencao DATE NOT NULL,

-- diagnostico TEXT, solucao TEXT, tecnico_responsavel VARCHAR(100), 
 
-- FOREIGN KEY (id_equipamento) REFERENCES equipamento(id_equipamento) );

-- SELECT * FROM manutencao;
```
