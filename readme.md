https://refactoring.guru/pt-br/design-patterns/abstract-factory

# Padrão Criacional Abstract Factory

## Propósito
O Abstract Factory é um padrão de projeto criacional que permite que você produza famílias de objetos relacionados sem ter que especificar suas classes concretas.

## Problema
Imagine que você está criando um simulador de loja de mobílias. Seu código consiste de classes que representam:

Uma família de produtos relacionados, como: Cadeira + Sofá + MesaDeCentro.

Várias variantes dessa família. Por exemplo, produtos Cadeira + Sofá + MesaDeCentro estão disponíveis nessas variantes: Moderno, Vitoriano, ArtDeco.

Você precisa de um jeito de criar objetos de mobília individuais para que eles combinem com outros objetos da mesma família. Os clientes ficam muito bravos quando recebem mobília que não combina.

E ainda, você não quer mudar o código existente quando adiciona novos produtos ou famílias de produtos ao programa. Os vendedores de mobílias atualizam seus catálogos com frequência e você não vai querer mudar o código base cada vez que isso acontece.


## Solução
A primeira coisa que o padrão Abstract Factory sugere é declarar explicitamente interfaces para cada produto distinto da família de produtos (ex: cadeira, sofá ou mesa de centro). Então você pode fazer todas as variantes dos produtos seguirem essas interfaces. Por exemplo, todas as variantes de cadeira podem implementar a interface Cadeira; todas as variantes de mesa de centro podem implementar a interface MesaDeCentro, e assim por diante.

O próximo passo é declarar a fábrica abstrata—uma interface com uma lista de métodos de criação para todos os produtos que fazem parte da família de produtos (por exemplo, criarCadeira, criarSofá e criarMesaDeCentro). Esses métodos devem retornar tipos abstratos de produtos representados pelas interfaces que extraímos previamente: Cadeira, Sofá, MesaDeCentro e assim por diante.

Agora, e o que fazer sobre as variantes de produtos? Para cada variante de uma família de produtos nós criamos uma classe fábrica separada baseada na interface FábricaAbstrata. Uma fábrica é uma classe que retorna produtos de um tipo em particular. Por exemplo, a classe FábricaMobíliaModerna só pode criar objetos CadeiraModerna, SofáModerno, e MesaDeCentroModerna.

O código cliente tem que funcionar com ambos as fábricas e produtos via suas respectivas interfaces abstratas. Isso permite que você mude o tipo de uma fábrica que passou para o código cliente, bem como a variante do produto que o código cliente recebeu, sem quebrar o código cliente atual.

Digamos que o cliente quer que uma fábrica produza uma cadeira. O cliente não precisa estar ciente da classe fábrica, e nem se importa que tipo de cadeira ele receberá. Seja ela um modelo Moderno ou no estilo Vitoriano, o cliente precisa tratar todas as cadeiras da mesma maneira, usando a interface abstrata Cadeira. Com essa abordagem, a única coisa que o cliente sabe sobre a cadeira é que ela implementa o método sentar de alguma maneira. E também, seja qual for a variante da cadeira retornada, ela sempre irá combinar com o tipo de sofá ou mesa de centro produzido pelo mesmo objeto fábrica.

Há mais uma coisa a se clarificar: se o cliente está exposto apenas às interfaces abstratas, o que realmente cria os objetos fábrica então? Geralmente, o programa cria um objeto fábrica concreto no estágio de inicialização. Antes disso, o programa deve selecionar o tipo de fábrica dependendo da configuração ou definições de ambiente.


