class Question
    # Com um acessador de atributos, definimos uma pergunta e resposta
    attr_accessor :prompt, :answer

    #inicializa o objeto para criar perguntas
    def initialize(prompt, answer)
        @prompt = prompt
        @answer = answer
    end
end

puts "\nDigite seu nome para começar o quiz: "
name = gets.chomp()

puts "\n\nSeja bem vindo(a) #{name}, e boa sorte!! :)"
puts "\n"

p1 = "1. Quais cores compõem a Logo do GitHub?\n(a) Branco e Azul \n(b) Cinza e azul \n(c) Branco e preto \n(d) Branco e cinza \n(e) Cinza e preto"
p2 = "\n2. A sigla LGPD significa 'Lei Geral de Proteção de Dados'.\n(a) Verdadeiro \n(b) Falso"
p3 = "\n3. Quantas linguagens de programação estão sendo apresentadas referente aos projetos dessa matéria?\n(a) 12 \n(b) 10 \n(c) 8 \n(d) 14"
p4 = "\n4. O que significa a sigla 'WWW' na internet?\n(a) Web wide world \n(b) Web world wide \n(c) World wide web"
p5 = "\n5. Quanto é 4 x (8+6+2)/5 - 0,8 + 8 ?\n(a) 19\n(b) 20 \n(c) 23 \n(d) 22"

questions = [
    Question.new(p1, "c"),
    Question.new(p2, "a"),
    Question.new(p3, "a"),
    Question.new(p4, "c"),
    Question.new(p5, "b")
]

def comecar_teste(questions)
    answer = ""
    score = 0
    for question in questions
        puts question.prompt
        answer = gets.chomp()

        if answer == question.answer
            score += 1
        end
    end
   
    puts "\nVocê finalizou o quiz, e acertou " + score.to_s + "/" + questions.length().to_s + " das questões.\nAté a próxima ;)"

end

comecar_teste(questions)
