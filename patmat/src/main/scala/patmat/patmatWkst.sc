package patmat



object patmatWkst {
  val testString = Huffman.string2Chars("He")     //> testString  : List[Char] = List(H, e)
  val testTimes = Huffman.times(testString)       //> testTimes  : List[(Char, Int)] = List((e,1), (H,1))
  val testfreqs = Huffman.makeOrderedLeafList(testTimes)
                                                  //> testfreqs  : List[patmat.Huffman.Leaf] = List(Leaf(H,1), Leaf(e,1))

  
  Huffman.makeOrderedLeafList(List(('t', 2), ('e', 1), ('x', 3)))
                                                  //> res0: List[patmat.Huffman.Leaf] = List(Leaf(e,1), Leaf(t,2), Leaf(x,3))
  Huffman.singleton(List(Huffman.Leaf('c', 2), Huffman.Leaf('d', 3)))
                                                  //> res1: Boolean = false

List(Huffman.Leaf('c', 2), Huffman.Leaf('d', 3))  //> res2: List[patmat.Huffman.Leaf] = List(Leaf(c,2), Leaf(d,3))
val testTree = Huffman.combine(List(Huffman.Leaf('c', 2), Huffman.Leaf('d', 3)))
                                                  //> testTree  : List[patmat.Huffman.CodeTree] = List(Fork(Leaf(c,2),Leaf(d,3),Li
                                                  //| st(c, d),5))
                                                  
Huffman.singleton(testTree)                       //> res3: Boolean = true

val simpleTree = Huffman.makeCodeTree(Huffman.Leaf('c', 2), Huffman.Leaf('d', 3))
                                                  //> simpleTree  : patmat.Huffman.Fork = Fork(Leaf(c,2),Leaf(d,3),List(c, d),5)
val testChars = Huffman.string2Chars("Hello world")
                                                  //> testChars  : List[Char] = List(H, e, l, l, o,  , w, o, r, l, d)
val resultTree = Huffman.createCodeTree(testChars)//> resultTree  : patmat.Huffman.CodeTree = Fork(Fork(Fork(Fork(Fork(Fork(Fork(L
                                                  //| eaf( ,1),Leaf(H,1),List( , H),2),Leaf(w,1),List( , H, w),3),Leaf(o,2),List( 
                                                  //| , H, w, o),5),Leaf(d,1),List( , H, w, o, d),6),Leaf(e,1),List( , H, w, o, d,
                                                  //|  e),7),Leaf(r,1),List( , H, w, o, d, e, r),8),Leaf(l,3),List( , H, w, o, d, 
                                                  //| e, r, l),11)









val testTree2 = Huffman.makeOrderedLeafList(Huffman.times(testChars))
                                                  //> testTree2  : List[patmat.Huffman.Leaf] = List(Leaf( ,1), Leaf(H,1), Leaf(w,1
                                                  //| ), Leaf(o,2), Leaf(d,1), Leaf(e,1), Leaf(r,1), Leaf(l,3))




val combine1 = Huffman.combine(testTree2)         //> combine1  : List[patmat.Huffman.CodeTree] = List(Fork(Leaf( ,1),Leaf(H,1),Li
                                                  //| st( , H),2), Leaf(w,1), Leaf(o,2), Leaf(d,1), Leaf(e,1), Leaf(r,1), Leaf(l,3
                                                  //| ))
val combine2 = Huffman.combine(combine1)          //> combine2  : List[patmat.Huffman.CodeTree] = List(Fork(Fork(Leaf( ,1),Leaf(H,
                                                  //| 1),List( , H),2),Leaf(w,1),List( , H, w),3), Leaf(o,2), Leaf(d,1), Leaf(e,1)
                                                  //| , Leaf(r,1), Leaf(l,3))
val combine3 = Huffman.combine(combine2)          //> combine3  : List[patmat.Huffman.CodeTree] = List(Fork(Fork(Fork(Leaf( ,1),Le
                                                  //| af(H,1),List( , H),2),Leaf(w,1),List( , H, w),3),Leaf(o,2),List( , H, w, o),
                                                  //| 5), Leaf(d,1), Leaf(e,1), Leaf(r,1), Leaf(l,3))
val combine4 = Huffman.combine(combine3)          //> combine4  : List[patmat.Huffman.CodeTree] = List(Fork(Fork(Fork(Fork(Leaf( ,
                                                  //| 1),Leaf(H,1),List( , H),2),Leaf(w,1),List( , H, w),3),Leaf(o,2),List( , H, w
                                                  //| , o),5),Leaf(d,1),List( , H, w, o, d),6), Leaf(e,1), Leaf(r,1), Leaf(l,3))

val combine5 = Huffman.combine(combine4)          //> combine5  : List[patmat.Huffman.CodeTree] = List(Fork(Fork(Fork(Fork(Fork(L
                                                  //| eaf( ,1),Leaf(H,1),List( , H),2),Leaf(w,1),List( , H, w),3),Leaf(o,2),List(
                                                  //|  , H, w, o),5),Leaf(d,1),List( , H, w, o, d),6),Leaf(e,1),List( , H, w, o, 
                                                  //| d, e),7), Leaf(r,1), Leaf(l,3))

val combine6 = Huffman.combine(combine5)          //> combine6  : List[patmat.Huffman.CodeTree] = List(Fork(Fork(Fork(Fork(Fork(F
                                                  //| ork(Leaf( ,1),Leaf(H,1),List( , H),2),Leaf(w,1),List( , H, w),3),Leaf(o,2),
                                                  //| List( , H, w, o),5),Leaf(d,1),List( , H, w, o, d),6),Leaf(e,1),List( , H, w
                                                  //| , o, d, e),7),Leaf(r,1),List( , H, w, o, d, e, r),8), Leaf(l,3))
val combine7 = Huffman.combine(combine6)          //> combine7  : List[patmat.Huffman.CodeTree] = List(Fork(Fork(Fork(Fork(Fork(F
                                                  //| ork(Fork(Leaf( ,1),Leaf(H,1),List( , H),2),Leaf(w,1),List( , H, w),3),Leaf(
                                                  //| o,2),List( , H, w, o),5),Leaf(d,1),List( , H, w, o, d),6),Leaf(e,1),List( ,
                                                  //|  H, w, o, d, e),7),Leaf(r,1),List( , H, w, o, d, e, r),8),Leaf(l,3),List( ,
                                                  //|  H, w, o, d, e, r, l),11))

val combine8 = Huffman.combine(combine7)          //> combine8  : List[patmat.Huffman.CodeTree] = List(Fork(Fork(Fork(Fork(Fork(F
                                                  //| ork(Fork(Leaf( ,1),Leaf(H,1),List( , H),2),Leaf(w,1),List( , H, w),3),Leaf(
                                                  //| o,2),List( , H, w, o),5),Leaf(d,1),List( , H, w, o, d),6),Leaf(e,1),List( ,
                                                  //|  H, w, o, d, e),7),Leaf(r,1),List( , H, w, o, d, e, r),8),Leaf(l,3),List( ,
                                                  //|  H, w, o, d, e, r, l),11))


}