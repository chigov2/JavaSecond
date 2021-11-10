package techmarket.uno.javasecond;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Spinner spinnerColors;
    private TextView tvDescriptionTemperament;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //находим элементы из макета
        spinnerColors = findViewById(R.id.spinnerColors);
        tvDescriptionTemperament = findViewById(R.id.tvDescriptionTemperament);
    }

    public void showDescription(View view) {
        int position = spinnerColors.getSelectedItemPosition();
        String description = getDescriptionByPosition(position);
        tvDescriptionTemperament.setText(description);
    }
    //новый метод - возвращает описание характера -возвращает строку,
    // а в качастве параметра получаем номер позиции єлемента
    private String getDescriptionByPosition(int position){
        //создаем массив строк с описанием характера
        String[] descriptions = getResources().getStringArray(R.array.temperament_description);
        return descriptions[position];
    }
}