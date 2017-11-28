package tk.cipaap.ciclodepalestradaaprendizagem.config;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by Fabricio on 27/11/2017.
 */

public class FirebaseConfig {
    private static DatabaseReference databaseFB;
    private static FirebaseAuth auht;

    public static DatabaseReference getFirebase(){
        if(databaseFB == null){
            databaseFB = FirebaseDatabase.getInstance().getReference();
        }
        return databaseFB;
    }

    public static FirebaseAuth getFirebaseAuth(){
        if(auht == null){
            auht = FirebaseAuth.getInstance();
        }
        return auht;
    }
}
