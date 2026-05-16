/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    var entero = x.toString();
    var palindromo = "" ;
    for(var i = entero.length-1; i>=0;i--){
        var palindromo = palindromo + entero.charAt(i)
    }
    if (entero === palindromo){
        return true
    } else{
        return false
    }
};
