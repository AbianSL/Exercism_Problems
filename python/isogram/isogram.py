def is_isogram(string):
    string = string.replace('-', '').replace(' ', '').replace('_', '').lower() 
    return len(string) == len(set(string))
