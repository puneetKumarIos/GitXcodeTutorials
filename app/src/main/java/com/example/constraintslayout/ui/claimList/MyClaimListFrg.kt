package com.example.constraintslayout.ui.claimList

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import android.view.*
import com.example.constraintslayout.*
import com.example.constraintslayout.ui.cliamDetails.ClaimDetailsFrg
import com.example.constraintslayout.ui.homeActivity.HomeActivity
import com.example.constraintslayout.ui.mainActivity.MainActivity
import kotlinx.android.synthetic.main.fragment_my_claim_list.*


class MyClaimListFrg : Fragment()
{

    // ==================================================================================//
    // MARK: ********************* variable *********************
    // ==================================================================================//

    var modelArray  =  Array<MyClaimModel>(0){
        MyClaimModel(
            "puneet"
        )
    }

    // ==================================================================================//
    // MARK: ********************* Default  Fragment Method *********************
    // ==================================================================================//


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)

    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_my_claim_list, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)

        setUpToolBar()
        initialization()
        setUpRecyclerView()

    }



    // ==================================================================================//
    // MARK: ********************* Default  Navigation Bar Method *********************
    // ==================================================================================//

    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {

        inflater?.inflate(R.menu.my_claim_navigation_menu,menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        when(item?.itemId)
        {
            R.id.claim_filter ->
            {
                print("Menu Clicked :: $item?.itemId")


            }

        }
        return super.onOptionsItemSelected(item)
    }


    // ==================================================================================//
    // MARK: ********************* Listener *********************
    // ==================================================================================//

    fun itemClicked(position:Int)
    {
        print("Item Clicked at position :: $position")

        val fragment = ClaimDetailsFrg()
        (activity as HomeActivity).addFragment(fragment,"")
        (activity as HomeActivity).hideBottomNav(true)
    }

    // ==================================================================================//
    // MARK: ********************* Private Method *********************
    // ==================================================================================//

    fun setUpToolBar()
    {

    }

    private fun initialization()
    {
        modelArray   = Array(20) { MyClaimModel("puneet") }
    }

    private fun setUpRecyclerView()
    {
        my_claim_recycler.layoutManager      =
            LinearLayoutManager(this.context)
        this.my_claim_recycler.adapter       =
            MyClaimAdapter(
                modelArray,
                { position: Int -> itemClicked(position) })
    }


}
