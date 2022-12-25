def vencedor(resp, pc)
    resultado = (resp - pc) % 3

    if resultado == 1
        "\nParabéns! Você ganhou."
    elsif resultado == 2
        "\nNão foi dessa vez! O PC ganhou."
    else
        "\nEmpate! Boa sorte na próxima.."
    end
end    

escolha = {
    1 => 'Pedra',
    2 => 'Papel',
    3 => 'Tesoura'
}

recomecar = 's'

while recomecar == 's'
    
    escolha.each do |n,s|
        puts "#{n} - #{s}"
    end    

    print "\nEscolha uma das opções acima: "
    resp = gets.to_i

    while escolha[resp].nil?
        print 'Opção inválida! Por favor digite uma opção válida: '
        resp = gets.to_i
    end

    pc = Random.rand(3) + 1

    puts "\nVocê escolheu #{escolha[resp]}"
    puts "O PC escolheu #{escolha[pc]}\n\n"

    print vencedor(resp, pc)

    print "\n\nDeseja jogar novamente? [s/n] "
    recomecar = gets.chomp

end

puts "\nVocê saiu do jogo. Até logo! ;)"
