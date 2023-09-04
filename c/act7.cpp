#include <iostream>
using namespace std;

//node atau simpul
struct Node{
    char label;
    Node *left, *right, *parent;
};

Node *root, *newNode;

void creatNewTree(char label){
    if( root != NULL)
    cout << "\nTree sudah dibuat" << endl;
    else{
        root = new Node();
        root->label = label;
        root->left = NULL;
        root->right = NULL;
        root->parent = NULL;
        cout << "\nNode " << label << " berhasil dibuat menjadi root." << endl;
    }
}

//insert left
Node *insertLeft( char label, Node *node){
    if( root == NULL){
        cout << "\nBuat tree terlebih dahulu!!" << endl;
        return NULL;
    }else{
        //cek apakah anak kiri ada atau tidak
        if( node->left != NULL){
            //kalau ada
            cout << "\nNode " <<node->label << " Sudah ada anak kiri!!" <<endl;
            return NULL;
        }else{
            //kalau tidak ada
            newNode = new Node();
            newNode->label = label;
            newNode->left = NULL;
            newNode->right = NULL;
            newNode->parent = node;
            node->left = newNode;
            cout << "\nNode " << label << " berhasil ditambahkan ke anak kiri " << newNode->parent->label << endl;
            return newNode;
        }
    }
}

//insert right
Node *insertRight( char label, Node*node){
    if( root == NULL){
        cout << "\nBuat tree terlebih dahulu!!" << endl;
        return NULL;
    }else{
        //cek apakah anak kanan ada atau tidak
        if( node->right != NULL){
            //kalau ada
            cout << "\nNode " <<node->label << "Sudah ada anak kanan!!" <<endl;
            return NULL;
        }else{
            //kalau tidak ada
            newNode = new Node();
            newNode->label = label;
            newNode->left = NULL;
            newNode->right = NULL;
            newNode->parent = node;
            node->right = newNode;
            cout << "\nNode " << label << " berhasil ditambahkan ke anak kanan " << newNode->parent->label << endl;
            return newNode;
        }
    }
}

//transversal
//preOrder
void preOrder( Node *node = root){
    if( !root )
        cout << "\nBuat tree terlebih dahulu!!" << endl;
    else{
        if( node != NULL){
            cout << node->label << ", ";
            preOrder(node->left);
            preOrder(node->right);
        }
    }
}

//inOrder
void inOrder( Node *node = root){
    if( !root )
        cout << "\nBuat tree terlebih dahulu!!" << endl;
    else{
        if( node != NULL){
            inOrder(node->left);
            cout << node->label << ", ";
            preOrder(node->right);
        }
    }
}

//postOrder
void postOrder( Node *node = root){
    if( !root )
        cout << "\nBuat tree terlebih dahulu!!" << endl;
    else{
        if( node != NULL){
            postOrder(node->left);
            postOrder(node->right);
            cout << node->label << ", ";
        }
    }
}

int main(){
    creatNewTree('A');
    Node *nodeB,*nodeC,*nodeD,*nodeE,*nodeF,*nodeG,*nodeH,*nodeI,*nodeJ;
    nodeB = insertLeft('B',root);
    nodeC = insertRight('C',root);
    nodeD = insertLeft('D',nodeB);
    nodeE = insertRight('E',nodeB);
    nodeF = insertLeft('F',nodeC);
    nodeG = insertLeft('G',nodeE);
    nodeH = insertRight('H',nodeE);
    nodeI = insertLeft('I',nodeG);
    nodeJ = insertRight('J',nodeG);
    cout << "\n";

    cout << "Result PreOrder : ";
    preOrder();
    cout << "\n";

    cout << "Result InOrder : ";
    inOrder();
    cout << "\n";

    cout << "Result PostOrder : ";
    postOrder();
    cout << "\n";

}
