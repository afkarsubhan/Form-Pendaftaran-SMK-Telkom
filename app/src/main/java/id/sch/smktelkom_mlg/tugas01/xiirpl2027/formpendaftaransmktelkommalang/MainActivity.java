package id.sch.smktelkom_mlg.tugas01.xiirpl2027.formpendaftaransmktelkommalang;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;


@SuppressWarnings("ALL")
public class MainActivity extends AppCompatActivity {

    EditText etnama, etemail, ettl;
    RadioGroup jurusan, jeniskelamin;
    RadioButton rpl, tkj, laki, perempuan;
    Spinner spprovinsi, spkota;
    String[][] arKota = {{""}, {"Aceh Barat", "Aceh Barat Daya", "Acah Besar",
            "Aceh Jaya", "Aceh Selatan", "Aceh Tengah", "Banda Aceh",
            "Langsa", "Lhokseumawe", "Sabang", "Subulussalam"}, {"Badung", "Bangli",
            "Buleleng", "Gianyar", "Jembrana", "Tabanan", "Denpasar"}, {"Lebak", "Pandeglang", "Kabupaten Serang",
            "Kabupaten Tangerang", "Cilegon", "Kota Serang", "Kota Tangerang", "Kota Tangerang Selatan"},
            {"Seluma", "Bengkulu"}, {"Kabupaten Gorontalo", "Gorontalo Utara", "Pohuwato", "Kota Gorontalo"},
            {"Kepulauan Seribu", "Jakarta Barat", "Jakarta Pusat", "Jakarta Selatan", "Jakarta Timur", "Jakarta Utara"},
            {"Jambi"}, {"Kabupaten Bandung", "Bandung Barat", "Bekasi", "Bogor", "Ciamis", "Cianjur", "Cirebon", "Garut", "Indramayu",
            "Karawang", "Kuningan", "Majalengka", "Pangandaran", "Purwakarta", "Subang", "Sukabumi", "Sumedang", "Tasikmalaya", "Kota Bandung", "Kota Banjar",
            "Kota Bekasi", "Kota Bogor", "Kota Cimahi", "Kota Cirebon", "Kota Depok", "Kota Sukabumi", "Kota Tasikmalaya"}, {"Banjarnegara", "Banyumas",
            "Batang", "Blora", "Boyolali", "Brebes", "Cilacap", "Demak", "Grobogan", "Jepara", "KarangAnyar", "Kebumen", "Kendal", "Klaten", "Kudus", "Magelang",
            "Pati", "Pekalongan", "Pemalang", "Purbalingga", "Purworejo", "Rembang", "Semarang", "Sragen", "Sukoharjo", "Tegal", "Temanggung", "Wonogiri",
            "Wonosobo", "Kota Magelang", "Kota Pekalongan", "Salatiga", "Semarang", "Surakarta", "Kota Tegal"}, {"Bangkalan", "Banyuwangi", "Blitar",
            "Bojonegoro", "Bondowoso", "Gresik", "Jember", "Jombang", "Kediri", "Lamongan", "Lumjang", "Madiun", "Magetan", "Malang", "Mojokerto", "Nganjuk", "Ngawi", "Pacitan",
            "Pamekasan", "Pasuruan", "Ponorogo", "Probolinggo", "Sampang", "Siduarjo", "Situbondo", "Sumenep", "Trenggalek", "Tuban", "Tulungagung", "Kota Batu",
            "Kota Blitar", "Kota Madiun", "Kota Malang", "Kota Mojokerto", "Kota Pasuruan", "Kota Probolinggo", "Kota Surabaya"}, {"Sintang", "Pontianak", "Singkawang"},
            {"Barito Selatan", "Barito Timur", "Barito Utara", "Palangkaraya"}, {"Banjarbaru", "Banjarmasin"}, {"Kutai Kertanegara", "Mahakam Ulu",
            "Balikpapan", "Bontang", "Samarinda"}, {"Tarakan"}, {"Bangka", "Belitung"}, {"Kepulauan Anambas", "Lingga", "Natuna", "Batam", "Tanjung Pinang"},
            {"Lampung Barat", "Lampung Selatan", "Lampung Tengah", "Lampung Timur", "Lampung Utara", "Bandar Lampung", "Metro"}, {"Maluku Tengah", "Maluku Tenggara",
            "Maluku Barat Daya", "Maluku Tenggara Barat", "Ambon", "Kepulauan Aru",}, {"Halmahera Barat", "Halmahera Tengah", "Halmahera Timur", "Halmahera Selatan",
            "Halmahera Utara", "Kepulauan Sula", "Pulau Morotai", "Pulau Taliabu", "Ternate", "Tidore Kepulauan"}, {"Bima"}, {"Alor"}, {"Irian Jaya"}, {"Manokwari"},
            {"Pekanbaru"}, {"Mamuju"}, {"Palu"}, {"Makasar"}, {"Kendari"}, {"Manado"}, {"Padang"}, {"Palembang"}, {"Medan"}, {"Sleman", "Kota Yogyakarta"}};

    ArrayList<String> listKota = new ArrayList<>();
    ArrayAdapter<String> adapter;
    CheckBox osis, mpk, dkg, pustel, medsan, bdi, paskibra, futsal, volley, basket, spcc;
    TextView hnama, hemail, htl, hjurusan, hasal, horganisasi, tjurusan;
    EditText etno, etAS, etagama;
    TextView hno, hagama, has, hjk, hekstra;
    Button buttonOK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etno = (EditText) findViewById(R.id.no);
        etAS = (EditText) findViewById(R.id.AS);
        etagama = (EditText) findViewById(R.id.Agama);
        etnama = (EditText) findViewById(R.id.nama);
        etemail = (EditText) findViewById(R.id.Email);
        ettl = (EditText) findViewById(R.id.TL);
        laki = (RadioButton) findViewById(R.id.laki);
        perempuan = (RadioButton) findViewById(R.id.perempuan);
        rpl = (RadioButton) findViewById(R.id.RPL);
        tkj = (RadioButton) findViewById(R.id.TKJ);
        tjurusan = (TextView) findViewById(R.id.textViewJurusan);
        jurusan = (RadioGroup) findViewById(R.id.jurussan);
        osis = (CheckBox) findViewById(R.id.checkBoxOSIS);
        mpk = (CheckBox) findViewById(R.id.checkBoxMPK);
        dkg = (CheckBox) findViewById(R.id.checkBoxDKG);
        paskibra = (CheckBox) findViewById(R.id.checkBoxPaskibra);
        pustel = (CheckBox) findViewById(R.id.checkBoxPustel);
        medsan = (CheckBox) findViewById(R.id.checkBoxMedsan);
        bdi = (CheckBox) findViewById(R.id.checkBoxBDI);
        basket = (CheckBox) findViewById(R.id.checkBoxBasket);
        futsal = (CheckBox) findViewById(R.id.checkBoxFutsal);
        volley = (CheckBox) findViewById(R.id.checkBoxVolly);
        spcc = (CheckBox) findViewById(R.id.checkBoxSPCC);
        hnama = (TextView) findViewById(R.id.hnama);
        hno = (TextView) findViewById(R.id.hno);
        has = (TextView) findViewById(R.id.has);
        hagama = (TextView) findViewById(R.id.hagama);
        hemail = (TextView) findViewById(R.id.hemail);
        htl = (TextView) findViewById(R.id.htl);
        hjurusan = (TextView) findViewById(R.id.hjurusan);
        hasal = (TextView) findViewById(R.id.hasal);
        horganisasi = (TextView) findViewById(R.id.horganisasi);
        hjk = (TextView) findViewById(R.id.hjeniskelamin);
        hekstra = (TextView) findViewById(R.id.hekstra);
        buttonOK = (Button) findViewById(R.id.buttonDaftar);
        spprovinsi = (Spinner) findViewById(R.id.spinnerprovinsi);
        spkota = (Spinner) findViewById(R.id.spinnerkota);

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, listKota);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spkota.setAdapter(adapter);

        spprovinsi.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long id) {
                listKota.clear();
                listKota.addAll(Arrays.asList(arKota[pos]));
                adapter.notifyDataSetChanged();
                spkota.setSelection(0);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        findViewById(R.id.buttonDaftar).setOnClickListener(new View.OnClickListener() {
                                                               @Override
                                                               public void onClick(View view) {
                                                                   doClick();
                                                               }

                                                               private void doClick() {
                                                                   if (isValid()) {

                                                                       String nama = etnama.getText().toString();
                                                                       hnama.setText("Nama : " + nama);
                                                                       String email = etemail.getText().toString();
                                                                       hemail.setText("Email : " + email);
                                                                       int tahun = Integer.parseInt(ettl.getText().toString());
                                                                       htl.setText("Tahun Kelahiran : " + tahun);
                                                                       int no = Integer.parseInt(etno.getText().toString());
                                                                       hno.setText("No Telephone : " + no);
                                                                   }

                                                               }

                                                               private boolean isValid() {
                                                                   boolean valid = true;
                                                                   String hasil = null;
                                                                   if (rpl.isChecked()) {
                                                                       hasil = rpl.getText().toString();
                                                                       hjurusan.setText("Jurusan              : RPL");
                                                                       valid = true;
                                                                   } else if (tkj.isChecked()) {
                                                                       hasil = tkj.getText().toString();
                                                                       hjurusan.setText("Jurusan              : TKJ");
                                                                       valid = true;
                                                                   }


                                                                   String nama = etnama.getText().toString();
                                                                   String email = etemail.getText().toString();
                                                                   String tahun = ettl.getText().toString();
                                                                   String no = etno.getText().toString();
                                                                   String agama = etagama.getText().toString();
                                                                   String as = etAS.getText().toString();


                                                                   if (nama.isEmpty()) {
                                                                       etnama.setError("Nama Belum diisi");
                                                                       valid = false;
                                                                   } else if (nama.length() < 3) {
                                                                       etnama.setError("Nama minimal 3 karakter");
                                                                       valid = false;
                                                                   } else {
                                                                       hnama.setText("Nama                   : " + nama);
                                                                   }

                                                                   if (email.isEmpty()) {
                                                                       etemail.setError("Email Belum diisi");
                                                                       valid = false;
                                                                   } else {
                                                                       hemail.setText("Email                    : " + email);
                                                                   }
                                                                   if (tahun.isEmpty()) {
                                                                       ettl.setError("Tahun Kelahiran Belum diisi");
                                                                       valid = false;
                                                                   } else if (tahun.length() != 8) {
                                                                       ettl.setError("Format tahun ddmmyyyy");
                                                                       valid = false;
                                                                   } else {
                                                                       htl.setText("Tanggal Lahir     : " + tahun);
                                                                   }

                                                                   hasal.setText("Asal                      : " + spkota.getSelectedItem().toString()
                                                                           + " " + spprovinsi.getSelectedItem().toString());

                                                                   String orga = "Organisasi yang diikuti : ";
                                                                   int startlen = orga.length();
                                                                   if (osis.isChecked()) orga += osis.getText() + " ";
                                                                   if (mpk.isChecked()) orga += mpk.getText() + " ";
                                                                   if (dkg.isChecked()) orga += dkg.getText() + " ";

                                                                   if (orga.length() == startlen) orga += "Tidak ada";

                                                                   horganisasi.setText(orga);

                                                                   if (no.isEmpty()) {
                                                                       etno.setError("Nomor belum diisi");
                                                                       valid = false;
                                                                   } else if (no.length() < 6) {
                                                                       etno.setError("Nomor yang dimasukkan kurang");
                                                                       valid = false;
                                                                   } else if (no.length() > 12) {
                                                                       etno.setError("Nomor yang dimasukkan terlalu banyak");
                                                                       valid = false;
                                                                   } else {
                                                                       hno.setText("No Telepon         : " + no);
                                                                   }
                                                                   if (agama.isEmpty()) {
                                                                       etagama.setError("Agama belum diisi");
                                                                       valid = false;
                                                                   } else {
                                                                       hagama.setText("Agama                 : " + agama);
                                                                   }
                                                                   if (as.isEmpty()) {
                                                                       etAS.setError("Sekolah Asal Belum diisi");
                                                                       valid = false;
                                                                   } else {
                                                                       has.setText("Asal Sekolah      : " + as);
                                                                   }

                                                                   String jk = null;
                                                                   if (laki.isChecked()) {
                                                                       jk = laki.getText().toString();
                                                                       hjk.setText("Jenis Kelamin    : Laki-laki");
                                                                       valid = true;
                                                                   } else if (perempuan.isChecked()) {
                                                                       jk = perempuan.getText().toString();
                                                                       hjk.setText("Jenis Kelamin    : Perempuan");
                                                                       valid = true;
                                                                   }

                                                                   String ekstra = "Ekstra yang diikuti : ";
                                                                   int starteks = ekstra.length();
                                                                   if (paskibra.isChecked()) ekstra += paskibra.getText() + " ";
                                                                   if (pustel.isChecked()) ekstra += pustel.getText() + " ";
                                                                   if (medsan.isChecked()) ekstra += medsan.getText() + " ";
                                                                   if (bdi.isChecked()) ekstra += bdi.getText() + " ";
                                                                   if (futsal.isChecked()) ekstra += futsal.getText() + " ";
                                                                   if (basket.isChecked()) ekstra += basket.getText() + " ";
                                                                   if (volley.isChecked()) ekstra += volley.getText() + " ";
                                                                   if (spcc.isChecked()) ekstra += spcc.getText() + " ";


                                                                   if (ekstra.length() == starteks) ekstra += "Tidak ada";

                                                                   hekstra.setText(ekstra);


                                                                   return false;
                                                               }
                                                           }

        );
    }
}
