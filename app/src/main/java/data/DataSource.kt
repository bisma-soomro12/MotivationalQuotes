package data

import android.view.Display
import com.example.motivationalqoutes.R
import model.Model

class DataSource {

    fun loadModel(): List<Model> {
        return listOf<Model>(
                    Model(R.string.affirmation1,R.drawable.image1),
                    Model(R.string.affirmation2,R.drawable.image2),
                    Model(R.string.affirmation3,R.drawable.image3),
                    Model(R.string.affirmation4,R.drawable.image4),
                    Model(R.string.affirmation5,R.drawable.image5),
                    Model(R.string.affirmation6,R.drawable.image6),
                    Model(R.string.affirmation7,R.drawable.image7),
                    Model(R.string.affirmation8,R.drawable.image8),
                    Model(R.string.affirmation9,R.drawable.image9),
                    Model(R.string.affirmation10,R.drawable.image10)

        )
    }
}