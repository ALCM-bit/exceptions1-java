# exeptions1-java
<strong>• Solução 1 (muito ruim): lógica de validação no programa principal</strong>
</br>
• Lógica de validação não delegada à reserva
</br>
</br>
<strong> • Solução 2 (ruim): método retornando string </strong>
</br>
• A semântica da operação é prejudicada
</br>
• Retornar string não tem nada a ver com atualização de reserva
</br>
• E se a operação tivesse que retornar um string?
</br>
• Ainda não é possível tratar exceções em construtores
</br>
• Ainda não há auxílio do compilador: o programador deve "lembrar" de verificar se houve
erro
</br>
• A lógica fica estruturada em condicionais aninhadas
</br>
</br>
<strong> • Solução 3 (boa): tratamento de exceções </strong>
<br>
</br>
Exercicio feito com base no programa fornecido em : https://github.com/acenelio/exceptions1-java
