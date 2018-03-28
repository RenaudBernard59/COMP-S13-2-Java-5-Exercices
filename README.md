# COMP-S13-3-Java-5

##Aide pour exercice 3

bn = (niv*2)-1 = base par niveau
bt=(h*2)-1 = base totale

(bt-niv)/2 = nb d'esapces

----------------------

    ```Java
    int h = saisieClavier;
    int bt=(h*2)-1;
    ///
    int be = ((i-1)*2)-1;
    ///
    for(int i=1;i<=h;i++) {
        String chaine = "";
        int bn = (i*2)-1;
        for(int j=1;j=(bt/bn)/2;j++) {
        chaine+=" ";    
        }
        chaine+="*";
        ///
        for(int j=1;j=be;j++) {
        chaine+=" ";    
        }
        ///
        chaine+="*";
        for(int j=1;j=(bt/bn)/2;j++) {
        chaine+=" ";    
        }
        afficher(chaine);
    }
    ```