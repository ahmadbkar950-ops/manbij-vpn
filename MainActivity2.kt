import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.setPadding(40, 80, 40, 40)

        val title = TextView(this)
        title.text = "Manbij VPN"
        title.textSize = 30f

        val status = TextView(this)
        status.text = "الحالة: غير متصل"
        status.textSize = 20f

        val button = Button(this)
        button.text = "اتصال"

        button.setOnClickListener {
            status.text = "الحالة: جاري الاتصال..."
        }

        layout.addView(title)
        layout.addView(status)
        layout.addView(button)

        setContentView(layout)
    }
}
