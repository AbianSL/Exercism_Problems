class LogLineParser
  def initialize(line)
    @line = line
  end

  def message
    @line.split(':').last.strip
  end

  def log_level
    @line.split(':')[0].gsub(/[\[\]]/, '').downcase 
  end

  def reformat
    raise 'Please implement the LogLineParser#reformat method'
  end
end
