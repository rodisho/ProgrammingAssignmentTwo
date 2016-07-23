package com.assignmenttwo.rafi.programmingassignmenttwo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ProfessorsListFragment extends Fragment implements View.OnClickListener {

    private TextView firstProf;
    private TextView secondProf;
    private TextView thirdProf;
    private TextView fourthProf;
    private TextView fifthProf;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.professors_list_fragment);
    }

    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.professors_list_fragment, container, false);

        firstProf = (TextView) view.findViewById (R.id.firstProf);
        secondProf = (TextView) view.findViewById(R.id.secondProf);
        thirdProf = (TextView) view.findViewById (R.id.thirdProf);
        fourthProf = (TextView) view.findViewById(R.id.fourthProf);
        fifthProf = (TextView) view.findViewById (R.id.fifthProf);

        firstProf.setOnClickListener(this);
        secondProf.setOnClickListener(this);
        thirdProf.setOnClickListener(this);
        fourthProf.setOnClickListener(this);
        fifthProf.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        Intent profDetailsIntent = new Intent (getActivity(), Main2Activity.class);
        switch(v.getId())
        {
            case R.id.firstProf:
                profDetailsIntent.putExtra("name", firstProf.getText().toString());
                //profDetailsIntent.putExtra("image", firstProf.getText)
                profDetailsIntent.putExtra("firstDegree", "Ph.D. Information Systems Engineering");
                profDetailsIntent.putExtra("secondDegree", "M.Sc. Computer Science");
                profDetailsIntent.putExtra("thirdDegree", "B.Sc Computer Science");
                break;
            case R.id.secondProf:
                profDetailsIntent.putExtra("name", secondProf.getText().toString());
                //profDetailsIntent.putExtra("image", firstProf.getText)
                profDetailsIntent.putExtra("firstDegree", "Ph.D. Computer Science");
                profDetailsIntent.putExtra("secondDegree", "MA. Computer Science");
                profDetailsIntent.putExtra("thirdDegree", "MS. Nuclear Engineering");
                profDetailsIntent.putExtra("fourthDegree", "BS. Electrical Engineering");
                break;
            case R.id.thirdProf:
                profDetailsIntent.putExtra("name", thirdProf.getText().toString());
                //profDetailsIntent.putExtra("image", firstProf.getText)
                profDetailsIntent.putExtra("firstDegree", "BA. Math and Physics");
                profDetailsIntent.putExtra("secondDegree", "Ph.D. Applied Mathematics");
                profDetailsIntent.putExtra("thirdDegree", "AMA/ACM Retraining in Computer Science");
                profDetailsIntent.putExtra("fourthDegree", "MS. Computer Science");
                break;
            case R.id.fourthProf:
                profDetailsIntent.putExtra("name", fourthProf.getText().toString());
                //profDetailsIntent.putExtra("image", firstProf.getText)
                profDetailsIntent.putExtra("firstDegree", "Ph.D Computer Science");
                profDetailsIntent.putExtra("secondDegree", "B.E. Computer Science");
                profDetailsIntent.putExtra("thirdDegree", "M.E. Computer Science");
                break;
            case R.id.fifthProf:
                profDetailsIntent.putExtra("name", fifthProf.getText().toString());
                //profDetailsIntent.putExtra("image", firstProf.getText)
                profDetailsIntent.putExtra("firstDegree", "Ph.D. Computer Science");
                profDetailsIntent.putExtra("secondDegree", "MS. Computer Science");
                profDetailsIntent.putExtra("thirdDegree", "BS. Computer Science");
                break;
        }

        startActivity(profDetailsIntent);

//        Intent profDetailsIntent = new Intent (getActivity(), ProfessorDetailsFragment.class);
//        switch(v.getId())
//        {
//            case R.id.firstProf:
//                profDetailsIntent.putExtra("name", firstProf.getText().toString());
//                //profDetailsIntent.putExtra("image", firstProf.getText)
//                profDetailsIntent.putExtra("firstDegree", "Ph.D. Information Systems Engineering");
//                profDetailsIntent.putExtra("secondDegree", "M.Sc. Computer Science");
//                profDetailsIntent.putExtra("thirdDegree", "B.Sc Computer Science");
//                break;
//            case R.id.secondProf:
//                profDetailsIntent.putExtra("name", secondProf.getText().toString());
//                //profDetailsIntent.putExtra("image", firstProf.getText)
//                profDetailsIntent.putExtra("firstDegree", "Ph.D. Computer Science");
//                profDetailsIntent.putExtra("secondDegree", "MA. Computer Science");
//                profDetailsIntent.putExtra("thirdDegree", "MS. Nuclear Engineering");
//                profDetailsIntent.putExtra("fourthDegree", "BS. Electrical Engineering");
//                break;
//            case R.id.thirdProf:
//                profDetailsIntent.putExtra("name", thirdProf.getText().toString());
//                //profDetailsIntent.putExtra("image", firstProf.getText)
//                profDetailsIntent.putExtra("firstDegree", "BA. Math and Physics");
//                profDetailsIntent.putExtra("secondDegree", "Ph.D. Applied Mathematics");
//                profDetailsIntent.putExtra("thirdDegree", "AMA/ACM Retraining in Computer Science");
//                profDetailsIntent.putExtra("fourthDegree", "MS. Computer Science");
//                break;
//            case R.id.fourthProf:
//                profDetailsIntent.putExtra("name", fourthProf.getText().toString());
//                //profDetailsIntent.putExtra("image", firstProf.getText)
//                profDetailsIntent.putExtra("firstDegree", "Ph.D Computer Science");
//                profDetailsIntent.putExtra("secondDegree", "B.E. Computer Science");
//                profDetailsIntent.putExtra("thirdDegree", "M.E. Computer Science");
//                break;
//           case R.id.fifthProf:
//                profDetailsIntent.putExtra("name", fifthProf.getText().toString());
//                //profDetailsIntent.putExtra("image", firstProf.getText)
//                profDetailsIntent.putExtra("firstDegree", "Ph.D. Computer Science");
//                profDetailsIntent.putExtra("secondDegree", "MS. Computer Science");
//                profDetailsIntent.putExtra("thirdDegree", "BS. Computer Science");
//               break;
//        }
//
//        startActivity(profDetailsIntent);
    }
}
