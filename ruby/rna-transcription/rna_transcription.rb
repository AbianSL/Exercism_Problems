=begin
Write your code for the 'Rna Transcription' exercise in this file. Make the tests in
`rna_transcription_test.rb` pass.

To get started with TDD, see the `README.md` file in your
`ruby/rna-transcription` directory.
=end

class Complement
  def self.of_dna(dna)
    result = ''
    rna.each_char do |char| 
      case char 
      when 'G'
        result += 'C'
      when 'C'
        result += 'G'
      when 'T'
        result += 'A'
      when 'A'
        result += 'U'
      end
    end
    result
  end
end
