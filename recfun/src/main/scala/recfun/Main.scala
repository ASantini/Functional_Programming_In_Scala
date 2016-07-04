package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {
      def getRow(r: Int, row: List[Int]): List[Int] = 
        if(r == row.size - 1) row 
        else getRow(r, nextRow(row, List(1)))
        
      def nextRow(row: List[Int], acc: List[Int]) : List[Int]= 
          if(row.isEmpty) acc 
          else if (row.tail.isEmpty) List(1)
          else nextRow(row.tail, acc ::: nextElement(row))
        
      def nextElement(row: List[Int]) : List[Int] = 
        if (row.isEmpty) List(1) 
        else List(row.head + row.tail.head)
      
        
      getRow(r, List())(c)
    }
  
  /**
   * Exercise 2
   */
   def balance(chars: List[Char]): Boolean = {

    def loop(parens: Int, chars: List[Char]): Boolean =
      if (parens < 0 || (chars.isEmpty && parens != 0)) false
      else if (chars.isEmpty && parens == 0) true
      else if (chars.head == '(') loop(parens + 1, chars.tail)
      else if (chars.head == ')') loop(parens - 1, chars.tail)
      else loop(parens, chars.tail)
    loop(0, chars)
  }
  
  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    def loop(money: Int, coins: List[Int]): Int =
      if (money == 0) 1
      else if (money < 0 || coins.isEmpty) 0
      else loop(money, coins.tail) + loop(money - coins.head, coins)
    loop(money, coins)
  }
  }
