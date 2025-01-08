# Regras do desafio
## Estrutura do e-mail
- nome_do_usuario@dominio.sufixodominio

### nome_do_usuario
- não pode ser vazio (exemplo: @algaworks.com)
- aceita letras (minúsculas ou maiúsculas) e digitos numéricos
- não aceita caracteres especiais
- permite underscore(_), hifem(-) e ponto final(.)

### domínio
- não pode ser vazio (exemplo: joao@.com)
- aceita letras minúsculas
- permite hifem(-), ponto final (.)

### sufixodominio
- aceita apenas letras minúsculas
- deve ter 2 ou 3 caracteres
- não aceita caracteres especiais

# Observações
- Embora não fosse solicitado no desafio, adicionei mais dois e-mails à lista de e-mails inválidos para a verificação, a fim de que não sejam permitidas letras com acentos (em nenhuma parte do e-mail), conforme feito em e-mails na web.
- Esse desafio é para fins didáticos, pois o ideal seria usar regex para solucioná-lo.