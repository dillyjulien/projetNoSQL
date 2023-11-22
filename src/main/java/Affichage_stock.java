import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class Affichage_stock {

    public static void main(String[] args){
        String mongoUri = "mongodb://localhost:27017";
        MongoClient mongoClient = MongoClients.create(mongoUri);
        MongoDatabase database = mongoClient.getDatabase("projetNoSQL");
        MongoCollection<Document> collection = database.getCollection("Maillot");

        for (Document document : collection.find()) {
            System.out.println(document.toJson());
        }

        mongoClient.close();
    }

}
