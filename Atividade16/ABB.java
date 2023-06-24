// import java.util.NoSuchElementException;

// public class ABB {
//     private Noh raiz;

//     public boolean isEmpty() {
//         return this.raiz == null;
//     }

//     public void add(int element) {
//         if (isEmpty()) {
//             this.raiz = new Noh(element);
//         } else {
//             Noh aux = this.raiz;
//             while (aux != null) {
//                 if (element < aux.getValor()) {
//                     if (aux.getEsq() == null) {
//                         Noh newNode = new Noh(element);
//                         aux.setEsq(newNode);
//                         newNode.setPai(aux);
//                         return;
//                     }
//                     aux = aux.getEsq();

//                 } else {
//                     if (aux.getDir() == null) {
//                         Noh newNode = new Noh(element);
//                         aux.setDir(newNode);
//                         newNode.setPai(aux);
//                         return;
//                     }
//                     aux = aux.getDir();
//                 } // fim else
//             } // fim while
//         } // fim else
//     }

//     public void recursiveAdd(int element) {
//         if (isEmpty()) {
//             this.raiz = new Noh(element);
//         } else {
//             recursiveAdd(this.raiz, element);
//         }
//     }

//     private void recursiveAdd(Noh node, int element) {
//         if (element < node.getValor()) {
//             if (node.getEsq() == null) {
//                 Noh newNode = new Noh(element);
//                 node.setEsq(newNode);
//                 newNode.setPai(node);
//                 return;
//             }
//             recursiveAdd(node.getEsq(), element);
//         } else {
//             if (node.getDir() == null) {
//                 Noh newNode = new Noh(element);
//                 node.setDir(newNode);
//                 newNode.setPai(node);
//                 return;
//             }
//             recursiveAdd(node.getDir(), element);
//         }
//     }

//     public void print(Noh raiz) {
//         if (isEmpty()) {
//             System.out.println("Empty tree");
//         } else {
//             print(this.raiz);
//         }
//     }

//     public void printEmOrdem(Noh raiz) {
//         printArvoreEmOrdem(raiz);
//     }

//     private void printArvoreEmOrdem(Noh noh) {
//         if (noh != null) {
//             printArvoreEmOrdem(noh.getEsq());
//             System.out.println("(" + noh.getValor() + ")");
//             printArvoreEmOrdem(noh.getDir());
//         }
//     }

//     public void printPreOrdem(Noh raiz) {
//         printArvorePreOrdem(raiz);
//     }

//     private void printArvorePreOrdem(Noh noh) {
//         if (noh != null) {
//             System.out.println("(" + noh.getValor() + ")");
//             printArvorePreOrdem(noh.getEsq());
//             printArvorePreOrdem(noh.getDir());
//         }
//     }

//     public void printPosOrdem(Noh raiz) {
//         printArvorePosOrdem(raiz);
//     }

//     public void printArvorePosOrdem(Noh noh) {
//         if (noh != null) {
//             printPosOrdem(noh.getEsq());
//             printPosOrdem(noh.getDir());
//             System.out.println(noh.getValor());
//         }
//     }

//     public boolean buscar(Noh raiz, int element) {
//         if (raiz == null) {
//             System.out.println("Elemento " + element + " não encontrado na árvore.");
//             return false; // Element not found
//         }

//         if (element == raiz.getValor()) {
//             System.out.println("Elemento " + element + " encontrado na árvore.");
//             return true; // Element found
//         }

//         if (element < raiz.getValor()) {
//             return buscar(raiz.getEsq(), element);
//         } else {
//             return buscar(raiz.getDir(), element);
//         }
//     }

//     public Noh getRaiz() {
//         return this.raiz;
//     }

//     public int getValorRaiz() {
//         if (raiz != null) {
//             return raiz.getValor();
//         } else {
//             throw new NoSuchElementException("A árvore está vazia. Não há raiz.");
//         }
//     }

//     public void removeNoh(int element) {
//         if (isEmpty()) {
//             System.out.println("Arvore vazia!");
//             return;
//         }

//         Noh noh = buscarNoh(raiz, element);
//         if (noh == null) {
//             System.out.println("Elemento " + element + " não encontrado na árvore.");
//             return;
//         }

//         if (noh.getEsq() == null && noh.getDir() == null) {
//             if (noh.getPai() == null) {
//                 this.raiz = null;
//             } else {
//                 if (noh.getPai().getEsq() == noh) {
//                     noh.getPai().setEsq(null);
//                 } else {
//                     noh.getPai().setDir(null);
//                 }
//             }
//         } else if (noh.getEsq() == null || noh.getDir() == null) {
//             if (noh.getPai() == null) {
//                 if (noh.getEsq() != null) {
//                     this.raiz = noh.getEsq();
//                 } else {
//                     this.raiz = noh.getDir();
//                 }
//             } else {
//                 if (noh.getPai().getEsq() == noh) {
//                     if (noh.getEsq() != null) {
//                         noh.getPai().setEsq(noh.getEsq());
//                     } else {
//                         noh.getPai().setEsq(noh.getDir());
//                     }
//                 } else {
//                     if (noh.getEsq() != null) {
//                         noh.getPai().setDir(noh.getEsq());
//                     } else {
//                         noh.getPai().setDir(noh.getDir());
//                     }
//                 }
//             }
//         } else {
//             Noh sucessor = sucessor(noh);
//             noh.setValor(sucessor.getValor());
//             if (sucessor.getPai().getEsq() == sucessor) {
//                 sucessor.getPai().setEsq(null);
//             } else {
//                 sucessor.getPai().setDir(null);
//             }
//         }
//     }

//     private Noh buscarNoh(Noh noh, int element) {
//         if (noh == null) {
//             return null;
//         }

//         if (element == noh.getValor()) {
//             return noh;
//         }

//         if (element < noh.getValor()) {
//             return buscarNoh(noh.getEsq(), element);
//         } else {
//             return buscarNoh(noh.getDir(), element);
//         }
//     }

//     private Noh sucessor(Noh noh) {
//         if (noh.getDir() != null) {
//             return minimo(noh.getDir());
//         } else {
//             Noh pai = noh.getPai();
//             while (pai != null && noh == pai.getDir()) {
//                 noh = pai;
//                 pai = pai.getPai();
//             }
//             return pai;
//         }
//     }

//     private Noh minimo(Noh dir) {
//         while (dir.getEsq() != null) {
//             dir = dir.getEsq();
//         }
//         return dir;
//     }

// }
