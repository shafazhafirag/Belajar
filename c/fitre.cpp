#include <iostream>
using namespace std;



struct Node{
    int label;
    int temp;

    Node *left, *right, *parent;
};



Node *root, *newnode;


bool isEmpty(){
    if (root ==NULL)
        return true;
    else
        return false;
}



void createTree(int data) {
    if (!isEmpty())
        cout << "\n [!]Tree Sudah Ada [!]" << endl;
        else{
            root = new Node();
            root -> label = data;
            root -> left = NULL;
            root -> right = NULL;
            root -> parent = NULL;
            cout << "Node" << data << ", berhasil dibuat menjadi root!\n";
}
}



Node *insertLeft (int data, Node *node){
    if (isEmpty()){
        cout << "[!] Buat Tree terlebih dahulu[!]" << endl;
        return NULL;
    }else{

        if(node -> left != NULL){
            cout << "\n Node " << node -> label
            << "Sudah memiliki anak kiri !" << endl;
            return NULL;
        }else{
            newnode = new Node();
            newnode -> label = data;
            newnode -> left = NULL;
            newnode -> right = NULL;
            newnode ->  parent = node;
            node -> left = newnode;
            cout << "\nNode" << data << " berhasil ditambahkan menjadi anak kiri\t"
            << newnode -> parent -> label << " !" << endl;
            return newnode;
}
}
}

Node *insertRight (int data, Node *node){
    if (isEmpty()){
        cout << "[!] Buat Tree terlebih dahulu[!]" << endl;
        return NULL;
    }else{

        if(node -> right != NULL){
            cout << "\n Node " << node -> label
            << "Sudah memiliki anak kanan !" << endl;
            return NULL;
        }else{
            newnode = new Node();
            newnode -> label = data;
            newnode -> left = NULL;
            newnode -> right = NULL;
            newnode ->  parent = node;
            node -> right = newnode;
            cout << "\nNode" << data << " berhasil ditambahkan menjadi anak kanan\t"
            << newnode -> parent -> label << " !" << endl;
            return newnode;
}
}
}



void update(int label,  Node *node ){
    if (!root){

    cout << "\n Buatlah treenya dahulu!!" << endl;
    }else {
        if (!node){
            cout << "\n Node Yang Akan di update tidak ada !!" << endl;
        }else{
            char temp = node -> label;
            node -> label = label;
            cout << "\nLabel Node : "<< temp <<
            "Berhasil diupdate Menjadi : " << label << endl;
}
}
}



void retrive (Node *node){
    if (!root){
        cout << "Buat Tree nya dulu !!" << endl;
        }else{
        if (!node){
            cout << "Nodenya tidak ada !!" << endl;
        }else{
            cout << "\nLabel Node :" << node -> label << endl;
}
}
}


void find(Node *node){
    if (!root)
        cout<< "Buat Tree"<< endl;
    else {
        if(!node)
            cout<< " Node yang di cari tidak ada" << endl;
        else{
            cout << "\nLabel Node :" << node -> label << endl;
            cout << "\nRobot Node :" << root -> label << endl;

            if (!node-> parent)
                cout << "\nParent Node: Tidak memiliki!"<< endl;
            else
                cout << "\nParent Node : "<< node -> parent-> label << endl;

            if(node-> parent!=NULL && node->parent->left!=node&&
               node->parent->right==node)
                cout<< "\nSaudara : " << node-> parent-> left->label << endl;
            else  if(node-> parent!=NULL && node->parent->right!=node&&
               node->parent->left ==node)
                cout<< "\nSaudara : " << node-> parent-> right->label << endl;
            else
                cout << "\nSaudara : Tidak Memiliki" << endl;

            if(!node->left)
                cout << "Anak Kiri node : Tidak Memiliki" << endl;
            else
                cout << "Anak Kiri Node :" << node ->left->label << endl;


            if(!node->right)
                cout << "Anak Kanan node : Tidak Memiliki" << endl;
            else
                cout << "Anak Kanan Node :" << node ->right->label << endl;


            }
        }
    }


 void inorder (Node *node = root){
    if(!root)
        cout<< "[!]Buat Tree Dulu[!]" << endl;
    else{
        if (node!=NULL){
            inorder(node-> left);
            cout << node->label << ", ";
            inorder(node->right);
        }
    }
 }



void preorder(Node *node = root){
    if(!root)
        cout << "[!]Buat Tree Dulu[!]" << endl;
    else{
        if (node!=NULL){
            cout << node-> label << ", ";
            preorder(node->left);
            preorder(node->right);
        }
    }
}


void postorder (Node *node = root){
    if(!root)
        cout << "\n[!] BUat Tree Dulu"<< endl;
    else{
        if(node!=NULL){
            postorder(node->left);
            postorder (node->right);
            cout<< node->label << ", ";
}
}
}


void deletebranch (Node *node){
    if(!root)
        cout << "\nBuat Tree Dulu" << endl;
    else{
        if (node!=NULL){
            if (node!=root){
                node -> parent -> left = NULL;
                node -> parent -> right = NULL;
            }
            deletebranch (node->left);
            deletebranch (node->right);

            if (node=root){
            delete root;
            root = NULL;
            }else{
            delete node;
            }
        }
    }
}


void clear_tree(){
    if (!root)
        cout << "\n[!] Buat Tree Dulu!!" << endl;
    else{
        deletebranch(root);
        cout << "\n[!]Tree Berhasil Dibersihkan[!]\n" ;
    }
    }


void delete_sub(Node *node){
    if (!root)
        cout << "\n[!]Buat Tree Dulu[!]" << endl;
    else{
        deletebranch(node->left);
        deletebranch(node->right);
        cout<< "\n[!] Sub (Anak) Tree Node :" <<node->label << ", Berhasil Dihapus[!]\n";
    }

}


int tree_size(Node *node = root){
if (!root)
    cout<< "\n[!]Buat Tree Dulu" << endl;
    else{
        if(!node)
            return 0;
        else
            return 1 + tree_size (node->left) + tree_size (node-> right);
    }

}

int tree_height (Node *node=root){
    if(!root)
        cout << " \n [!] Buat tree Dulu" << endl;
    else
        if(!node)
        return 0;
        else{
            int height_left = tree_height(node->left);
             int height_right = tree_height(node->right);

             if (height_left>=height_right)
                return height_left +1;

             else
                return height_right+1;
        }
}

void karakteristik (){
    cout<< "\nSize Tree :" << tree_size() << endl;
    cout << "\nHeight Tree : " << tree_height() << endl;
    cout << "\nAverage : " << tree_size() / tree_height() << endl;
    cout << "\nJumlah Node : " << tree_size() << endl;

}

int main(){

    createTree(1);

   Node *node2, *node3, *node4,
   *node5, *node6, *node7, *node8, *node9, *node10, *node11;

    node2 = insertLeft(2, root);
    node3 = insertRight (3, root);
    node4 = insertLeft (4, node2);
    node5 = insertRight (5, node2);
    node6 = insertLeft (6, node3);
    node7 = insertRight (7, node3);
    node8 = insertLeft (8, node4);
    node9 = insertRight (9, node4);
    node10 = insertLeft (10, node5);
    node11 = insertRight (11, node5);

    //update ('Q', nodeI);
    //retrive (nodeG);


    //string ket;
    //if(!isEmpty())
        //ket = "yes";
    //else
       // ket = "no";

    //cout << "\nApakah kalian memiliki tree ?!? :" << ket << endl;

    //find(nodeC);
    //cout << "\nInOrder   : ";  inorder (node4);
    //cout << "\nPreOrder  : ";  preorder (nodeD);
    //cout << "\nPostOrder : ";  postorder (nodeD);

    //clear_tree();
    //deletebranch(nodeB);
    //delete_sub(nodeJ);
    //retrive(nodeD);
    //karakteristik();

}