def is_isogram(string):
    alphabet = ["abcdefghijklmnopqrtsuvxyz"]
    for i in string:
        if i not in alphabet:
            return False
    return True
