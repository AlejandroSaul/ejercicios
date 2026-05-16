class Solution:
    def isPalindrome(self, x: int) -> bool:
        entero = str(x)
        inverso = ''
        for digit in range (len(entero)-1,-1,-1):
           inverso = inverso + entero[digit]
        if inverso == entero:
            return True
        else:
            return False
    