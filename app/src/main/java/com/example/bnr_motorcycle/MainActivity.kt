package com.example.bnr_motorcycle
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val motorcycles = listOf(
            Motorcycle("Honda NMAX 155", R.drawable.nmax),
            Motorcycle("Yamaha XSR 155", R.drawable.xsr),
            Motorcycle("Suzuki Thunder 150", R.drawable.thunder),
            Motorcycle("Yamaha Vixion 150", R.drawable.vixion),
            Motorcycle("Honda Sonic 150", R.drawable.fu),
            Motorcycle("Suzuki Gxr 150", R.drawable.gxr),
            Motorcycle("Suzuki GXS 150", R.drawable.gxs)
        )


        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = MotorcycleAdapter(motorcycles)
    }
}
