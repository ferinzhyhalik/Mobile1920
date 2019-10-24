package com.github.ferinzhyhalik.loremgenerator

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.DataBindingUtil.setContentView
import kotlinx.android.synthetic.main.activity_main.*
import com.github.ferinzhyhalik.loremgenerator.dataBind.ActivityMainBindingImpl


class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBindingImpl


    private var baconIpsum: Ips00m = Ips00m ( "Bacon Ipsum" , "Bacon ipsum dolor amet turkey burgdoggen tail meatball, filet mignon t-bone frankfurter kielbasa. Turkey turducken filet mignon, kielbasa fatback spare ribs flank. Sausage ham cupim shankle doner pork loin, biltong tri-tip ball tip. Spare ribs shankle drumstick, fatback shoulder turkey ham hock. Tongue ribeye pork loin, fatback picanha tri-tip rump biltong. Short ribs buffalo jowl rump, tri-tip andouille burgdoggen kevin.\n" +
                    "\n" +
                    "Landjaeger tenderloin chicken ball tip jowl buffalo fatback meatball. Pork jerky buffalo, ribeye sausage brisket kevin venison ball tip boudin beef filet mignon alcatra. Capicola pancetta venison, spare ribs ball tip filet mignon buffalo fatback. T-bone corned beef kielbasa, flank short loin beef ribs rump meatloaf. Turducken frankfurter ground round jerky, kielbasa rump boudin pastrami shank flank pork turkey t-bone short loin sausage. Spare ribs porchetta flank pig pork belly, meatball landjaeger leberkas pork loin jerky drumstick beef capicola rump burgdoggen.\n" +
                    "\n" +
                    "Burgdoggen flank rump doner pork belly shankle buffalo tongue ham hock short loin. Meatloaf shoulder andouille turkey, tri-tip bacon kevin ball tip tail filet mignon flank cow bresaola meatball capicola. Pork belly ham ground round cow meatloaf brisket. Venison beef ribs filet mignon drumstick swine sirloin pastrami tongue, cow prosciutto shoulder andouille ribeye. Cow pork belly capicola drumstick, buffalo meatball flank ham hock bacon burgdoggen. Spare ribs brisket shankle chuck, strip steak kielbasa prosciutto biltong pork tongue cupim jerky andouille tenderloin.\n" +
                    "\n" +
                    "Filet mignon frankfurter ribeye jerky swine hamburger turkey sausage. Fatback capicola ball tip ground round tail short loin salami bacon flank drumstick pancetta short ribs venison. Ground round kevin ham flank sirloin rump pork chop. Capicola pastrami sausage, swine picanha pig filet mignon buffalo leberkas drumstick bacon. Pastrami meatball ribeye andouille alcatra pork belly pork chop turkey picanha. Tongue burgdoggen pork ribeye, sausage kevin drumstick t-bone swine tri-tip shank strip steak prosciutto bresaola rump.\n" +
                    "\n" +
                    "Landjaeger porchetta doner, turducken pork chop boudin pork burgdoggen pastrami kevin chuck flank. Drumstick burgdoggen cow filet mignon brisket meatloaf cupim jerky. Shankle leberkas brisket porchetta landjaeger cupim fatback. Brisket burgdoggen beef pig."
            )
    private var catIpsum: Ips00m = Ips00m("cat Ipsum" ,"Cat ipsum dolor sit amet, aute. Ea occaecat and quis fugit. Fugit. Nihil molestiae yet tempor but eius voluptas. Eiusmod. Consectetur quaerat. Laudantium dolore quis and occaecat but lorem. Laboris accusantium but consequuntur and qui velitesse laudantium officia. Qui non, duis consequuntur vel and omnis commodo. Culpa eum nostrud vel for proident. Dicta vitae and esse. Do culpa so dolor rem eos corporis or vitae. Aperiam consequatur non. \n" +
                    "\n" +
                    "Incididunt fugit velit but voluptatem so eiusmod, and rem natus. Exercitationem adipisicing and excepteur, or ut. Ullamco adipisci. Sit aspernatur so rem in autem. Ullam. Quasi reprehenderit error ut yet minim so eos. Id.\n" +
                    "\n" +
                    "Consequatur nostrud natus and dolor. Labore dolor. Esse aliquip, yet officia. Molestiae quisquam, tempor voluptate or dolore. Qui omnis. Dolores. Incidunt incidunt, for rem occaecat for eaque sint. Deserunt deserunt exercitationem for rem. Labore aliquip so amet but ad so aperiam suscipit, incididunt. Incidunt proident. Mollit commodo nequeporro for adipisci. Ex labore. Eius id iste yet ipsa adipisci. Totam magnam so omnis. Officia cupidatat elit so incididunt. Do quaerat, or iste. Beatae. Suscipit labore.")
    private var TVIpsum: Ips00m = Ips00m("TV Ipsum", "On the most sensational inspirational celebrational Muppetational… This is what we call the Muppet Show. And if you threw a party - invited everyone you knew. You would see the biggest gift would be from me and the card attached would say thank you for being a friend. Well the first thing you know ol' Jeds a millionaire. Kinfolk said Jed move away from there. I have always wanted to have a neighbor just like you. I've always wanted to live in a neighborhood with you. And when the odds are against him and their dangers work to do. You bet your life Speed Racer he will see it through. Come and knock on our door. We've been waiting for you. Where the kisses are hers and hers and his. Three's company too. They were four men living all together yet they were all alone? Well we're movin' on up to the east side to a deluxe apartment in the sky.\n" +
                    "\n" +
                    "So join us here each week my friends you're sure to get a smile from seven stranded castaways here on Gilligans Isle? That this group would somehow form a family that's the way we all became the Brady Bunch. Michael Knight a young loner on a crusade to champion the cause of the innocent. The helpless. The powerless in a world of criminals who operate above the law. That this group would somehow form a family that's the way we all became the Brady Bunch., Here's the story of a lovely lady who was bringing up three very lovely girls. Baby if you've ever wondered - wondered whatever became of me. I'm living on the air in Cincinnati. Cincinnati WKRP. Come and dance on our floor. Take a step that is new. We've a loveable space that needs your face threes company too! That this group would somehow form a family that's the way we all became the Brady Bunch. Just sit right back and you'll hear a tale a tale of a fateful trip that started from this tropic port aboard this tiny ship! The movie star the professor and Mary Ann here on Gilligans Isle. The weather started getting rough - the tiny ship was tossed. If not for the courage of the fearless crew the Minnow would be lost. the Minnow would be lost. Fish don't fry in the kitchen and beans don't burn on the grill. Took a whole lotta tryin' just to get up that hill. So join us here each week my friends you're sure to get a smile from seven stranded castaways here on Gilligans Isle.\n" +
                    "\n")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = setContentView(this, R.layout.activity_main)
        binding.baconIpsum = baconIpsum
        binding.catIpsum = catIpsum
        binding.TVIpsum = TVIpsum

        val adapter =ArrayAdapter.createFromResource(
            this,
            R.array.lorem_types , android.R.layout.simple_spinner_item
        )
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            binding.lorem_spinner.adapter = adapter
            binding.lorem_spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener
            {
                override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                    val currentType: String = binding.lorem_spinner.getItemAtPosition(position).toString()
                    when (currentType) {
                        "Bacon Ipsum" -> {
                            binding.TitleShow.text = baconIpsum.type
                            binding.TitleShow.text = baconIpsum.content
                        }
                        "Cat Ipsum" -> {
                            binding.TitleShow.text = catIpsum.type
                            binding.TitleShow.text = catIpsum.content
                        }
                        "TV Ipsum" -> {
                            binding.TitleShow.text = TVIpsum.type
                            binding.TitleShow.text = TVIpsum.content
                        }

                    }
                }

                override fun onNothingSelected(p0: AdapterView<*>?) {
                    Log.d("Generator:: ", "onNothingSelected() is called, YEET TIME BOIS")
                }
            }

        binding.button.setOnClickListener(
            pickUserInput(binding.button)
        )
        binding.user_type.setOnClickListener {
            changeUserName(it)
        }
    }

    private fun changeUserName(it: View) {
        binding.apply {
            View.VISIBLE = View.GONE
            user_type.visibility = View.VISIBLE
        }
    }

    private fun pickUserInput(view: View){
        binding.apply {
            user_type.text = "by " + user_type.text.toString()
            user_type.visibility = View.GONE
            view.visibility = View.GONE
            lorem_spinner.visibility = View.GONE
            user_type.visibility = View.VISIBLE
        }

        val tip = Toast.makeText(this, "tap name to change the settings", Toast.LENGTH_SHORT)
        tip.setGravity(Gravity.CENTER, 0, -250)
        tip.show()

        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }
}
