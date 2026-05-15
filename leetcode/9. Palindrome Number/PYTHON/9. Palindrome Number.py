class Solution:
    def isPalindrome(self, x: int) -> bool:
        entero = str(x)
        inverso = ''
        for digit in range (len(entero)-1,-1,-1):
           inverso = inverso + entero[digit]

        print(inverso)
        if inverso == entero:
            return True
        else:
            return False
    
solucion = Solution()
print(solucion.isPalindrome(121))
