``` mermaid
---
title: 14.15. Desafio - interfaces
---
classDiagram
    class BemSeguravel {
        <<interface>>
        +calcularValorPremio() double*
        +descrever() String*
    }

    class VeiculoAutomotor {
	    <<Abstract>>
        -modelo: String
        -valorMercado: double
        -anoFabricacao: int
    }

    class CarroParticular {
        +calcularValorPremio() double
        +descrever() String
    }

    class Caminhao {
        -quantidadeEixos: int
        +calcularValorPremio() double
        +descrever() String
    }

    class ImovelResidencial {
        -valorMercado: double
        -areaConstruida: int
        +calcularValorPremio() double
        +descrever() String
    }

    class ServicoPropostaSeguro {
        +emitir(bem: BemSeguravel) void
    }

    %% Relacionamentos
	BemSeguravel <|.. VeiculoAutomotor
    BemSeguravel <|.. ImovelResidencial
    VeiculoAutomotor <|-- CarroParticular
    VeiculoAutomotor <|-- Caminhao
    ServicoPropostaSeguro ..> BemSeguravel

```