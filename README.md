# Desafio-Java-POO
Sistema para o agronegócio - Disciplina de Fábrica de Software - Unisc

Vamos desenvolver uma aplicação para auxiliar no controle e acompanhamento de animais em uma
fazenda. O negócio consiste na criação de bovinos, suínos e equinos, ou seja, na fazenda existem
animais de 3 tipos diferentes.
Quando um animal é comprado ou nasce, ele é incluído no plantel. São registrados a altura,
comprimento, largura e peso do animal. Estas medidas não podem ser menores ou iguais a 0. Cada
animal possui também um ID único (validar) que permite a consulta e atualização dos dados dele.
Periodicamente os animais são avaliados e as medidas são atualizadas no seu cadastro. Os valores das
novas medidas não podem ser inferiores às anteriores, caso isso ocorra uma mensagem de alerta deve
ser mostrada para que o animal seja examinado por um veterinário.
Cada animal possui um status que pode ser ‘Ativo’, ‘Vendido’ ou ‘Perdido’. Quando ele é incluído o
status passa a ser ativo.
Após um certo tempo animais são vendidos e neste caso é necessário alterar o status do animal e
registrar o preço da venda.
Caso ocorra a morte ou perda de um animal, o status dele é alterado para indicar que houve a perda.
O sistema deverá exibir um menu com as seguintes opções:
1. Incluir animal
2. Consultar animal
3. Avaliar animal
4. Registrar venda
5. Registrar perda
6. Relatório animais por tipo
7. Relatório vendas
8. Relatório perdas

O relatório de animais por tipo deve solicitar um tipo e mostrar os dados de todos os animais do tipo
que estão ativos.
O relatório de vendas deve mostrar os dados dos animais vendidos, incluindo o valor da venda. Ao
final deve ser mostrado o somatório dos valores de venda.
O relatório de perdas deve mostrar os dados de todos os animais perdidos. Ao final deve ser mostrada
contagem de perdas por tipo (bovino, suíno, equino).

Observação: Podem ser criadas as classes que o grupo entende que sejam necessárias, porém, é
fundamental manter o encapsulamento das classes, por meio da criação de getters e setters.
Cada classe criada deverá ter um contrutor.
