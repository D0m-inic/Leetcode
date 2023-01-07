class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        symbols = ('+','-','*','/')
        numberstack = []
        for token in tokens:
            if token not in symbols:
                numberstack.append(int(token))
            else:
                a = numberstack.pop()
                b = numberstack.pop()
                if token == '+':
                    numberstack.append(b + a)
                if token == '-':
                    numberstack.append(b - a)
                if token == '*':
                    numberstack.append(b * a)
                if token == '/':
                    numberstack.append(int(b / a))
        
        return numberstack[0]
        