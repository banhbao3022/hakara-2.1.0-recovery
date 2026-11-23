package p555j.p556a.p557a.p558a.p559a.p560a;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import java.util.HashMap;
import mtp.media.karaoke.R;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p334e.p348i.BottomSheetDialogFragment;
import p007c.p190n.p430e.GsonBuilder;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p606h.p609c.p612c.ModelPrefs;

/* JADX INFO: renamed from: j.a.a.a.a.a.g0, reason: use source file name */
/* JADX INFO: compiled from: VolumeFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class VolumeFragment extends BottomSheetDialogFragment {

    /* JADX INFO: renamed from: s0 */
    public static final a f30997s0 = new a(null);

    /* JADX INFO: renamed from: t0 */
    public b f30998t0;

    /* JADX INFO: renamed from: u0 */
    public boolean f30999u0;

    /* JADX INFO: renamed from: v0 */
    public HashMap f31000v0;

    /* JADX INFO: renamed from: j.a.a.a.a.a.g0$a */
    /* JADX INFO: compiled from: VolumeFragment.kt */
    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.a.g0$b */
    /* JADX INFO: compiled from: VolumeFragment.kt */
    public interface b {
        /* JADX INFO: renamed from: q */
        void mo13887q(int i, int i2);
    }

    /* JADX INFO: renamed from: j.a.a.a.a.a.g0$c */
    /* JADX INFO: compiled from: VolumeFragment.kt */
    public static final class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            VolumeFragment.this.mo11126W0();
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.a.g0$d */
    /* JADX INFO: compiled from: VolumeFragment.kt */
    public static final class d implements SeekBar.OnSeekBarChangeListener {
        public d() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            Intrinsics2.m13089e(seekBar, "seekBar");
            if (z) {
                VolumeFragment volumeFragment = VolumeFragment.this;
                b bVar = volumeFragment.f30998t0;
                if (bVar != null) {
                    SeekBar seekBar2 = (SeekBar) volumeFragment.m13886d1(R.id.seekBarVoice);
                    Intrinsics2.m13088d(seekBar2, "seekBarVoice");
                    bVar.mo13887q(i, seekBar2.getProgress());
                }
                TextView textView = (TextView) VolumeFragment.this.m13886d1(R.id.txtNumberMusic);
                Intrinsics2.m13088d(textView, "txtNumberMusic");
                textView.setText(String.valueOf(i));
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            Intrinsics2.m13089e(seekBar, "seekBar");
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            Intrinsics2.m13089e(seekBar, "seekBar");
            SeekBar seekBar2 = (SeekBar) VolumeFragment.this.m13886d1(R.id.seekBarMusic);
            Intrinsics2.m13088d(seekBar2, "seekBarMusic");
            Integer numValueOf = Integer.valueOf(seekBar2.getProgress());
            Intrinsics2.m13089e("music_vol", "key");
            String strM12319f = new GsonBuilder().m12322a().m12319f(numValueOf);
            SharedPreferences sharedPreferences = ModelPrefs.f32358a;
            if (sharedPreferences != null) {
                outline.m1564O(sharedPreferences, "music_vol", strM12319f);
            } else {
                Intrinsics2.m13096l("preferences");
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.a.g0$e */
    /* JADX INFO: compiled from: VolumeFragment.kt */
    public static final class e implements SeekBar.OnSeekBarChangeListener {
        public e() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            Intrinsics2.m13089e(seekBar, "seekBar");
            if (z) {
                VolumeFragment volumeFragment = VolumeFragment.this;
                b bVar = volumeFragment.f30998t0;
                if (bVar != null) {
                    SeekBar seekBar2 = (SeekBar) volumeFragment.m13886d1(R.id.seekBarMusic);
                    Intrinsics2.m13088d(seekBar2, "seekBarMusic");
                    bVar.mo13887q(seekBar2.getProgress(), i);
                }
                TextView textView = (TextView) VolumeFragment.this.m13886d1(R.id.txtNumberVoice);
                Intrinsics2.m13088d(textView, "txtNumberVoice");
                textView.setText(String.valueOf(i));
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            Intrinsics2.m13089e(seekBar, "seekBar");
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            Intrinsics2.m13089e(seekBar, "seekBar");
            SeekBar seekBar2 = (SeekBar) VolumeFragment.this.m13886d1(R.id.seekBarVoice);
            Intrinsics2.m13088d(seekBar2, "seekBarVoice");
            Integer numValueOf = Integer.valueOf(seekBar2.getProgress());
            Intrinsics2.m13089e("voice_vol", "key");
            String strM12319f = new GsonBuilder().m12322a().m12319f(numValueOf);
            SharedPreferences sharedPreferences = ModelPrefs.f32358a;
            if (sharedPreferences != null) {
                outline.m1564O(sharedPreferences, "voice_vol", strM12319f);
            } else {
                Intrinsics2.m13096l("preferences");
                throw null;
            }
        }
    }

    @Override // p636z0.p752p.p753c.DialogFragment
    /* JADX INFO: renamed from: Y0 */
    public int mo13868Y0() {
        return R.style.AppBottomSheetDialogThemeSing;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p636z0.p752p.p753c.DialogFragment, p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: Z */
    public void mo463Z(Context context) {
        Intrinsics2.m13089e(context, "context");
        super.mo463Z(context);
        if (context instanceof b) {
            this.f30998t0 = (b) context;
            return;
        }
        throw new RuntimeException(context + " must implement OnFragmentInteractionListener");
    }

    @Override // p636z0.p752p.p753c.DialogFragment, p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: c0 */
    public void mo465c0(Bundle bundle) {
        super.mo465c0(bundle);
        Bundle bundle2 = this.f38438m;
        if (bundle2 != null) {
            this.f30999u0 = bundle2.getBoolean("is_sing");
        }
    }

    /* JADX INFO: renamed from: d1 */
    public View m13886d1(int i) {
        if (this.f31000v0 == null) {
            this.f31000v0 = new HashMap();
        }
        View view = (View) this.f31000v0.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = this.f38416M;
        if (view2 == null) {
            return null;
        }
        View viewFindViewById = view2.findViewById(i);
        this.f31000v0.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: f0 */
    public View mo466f0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics2.m13089e(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_volume, viewGroup, false);
    }

    @Override // p636z0.p752p.p753c.DialogFragment, p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: h0 */
    public void mo467h0() {
        super.mo467h0();
        HashMap map = this.f31000v0;
        if (map != null) {
            map.clear();
        }
    }

    @Override // p636z0.p752p.p753c.DialogFragment, p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: i0 */
    public void mo1957i0() {
        super.mo1957i0();
        this.f30998t0 = null;
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: w0 */
    public void mo471w0(View view, Bundle bundle) {
        Intrinsics2.m13089e(view, "view");
        if (this.f30999u0) {
            ((ImageButton) m13886d1(R.id.btnVolumeClose)).setOnClickListener(new c());
        } else {
            TextView textView = (TextView) m13886d1(R.id.volumeTitle);
            Intrinsics2.m13088d(textView, "volumeTitle");
            SkuDao.a.m14061M(textView);
            ImageButton imageButton = (ImageButton) m13886d1(R.id.btnVolumeClose);
            Intrinsics2.m13088d(imageButton, "btnVolumeClose");
            SkuDao.a.m14061M(imageButton);
        }
        TextView textView2 = (TextView) m13886d1(R.id.txtNumberMusic);
        Intrinsics2.m13088d(textView2, "txtNumberMusic");
        SeekBar seekBar = (SeekBar) m13886d1(R.id.seekBarMusic);
        Intrinsics2.m13088d(seekBar, "seekBarMusic");
        textView2.setText(String.valueOf(seekBar.getProgress()));
        TextView textView3 = (TextView) m13886d1(R.id.txtNumberVoice);
        Intrinsics2.m13088d(textView3, "txtNumberVoice");
        SeekBar seekBar2 = (SeekBar) m13886d1(R.id.seekBarVoice);
        Intrinsics2.m13088d(seekBar2, "seekBarVoice");
        textView3.setText(String.valueOf(seekBar2.getProgress()));
        SharedPreferences sharedPreferences = ModelPrefs.f32358a;
        if (sharedPreferences == null) {
            Intrinsics2.m13096l("preferences");
            throw null;
        }
        Integer num = (Integer) outline.m1584f(sharedPreferences.getString("music_vol", null), Integer.class);
        int iIntValue = num != null ? num.intValue() : 70;
        TextView textView4 = (TextView) m13886d1(R.id.txtNumberMusic);
        Intrinsics2.m13088d(textView4, "txtNumberMusic");
        textView4.setText(String.valueOf(iIntValue));
        SeekBar seekBar3 = (SeekBar) m13886d1(R.id.seekBarMusic);
        Intrinsics2.m13088d(seekBar3, "seekBarMusic");
        seekBar3.setProgress(iIntValue);
        ((SeekBar) m13886d1(R.id.seekBarMusic)).setOnSeekBarChangeListener(new d());
        SharedPreferences sharedPreferences2 = ModelPrefs.f32358a;
        if (sharedPreferences2 == null) {
            Intrinsics2.m13096l("preferences");
            throw null;
        }
        Integer num2 = (Integer) outline.m1584f(sharedPreferences2.getString("voice_vol", null), Integer.class);
        int iIntValue2 = num2 != null ? num2.intValue() : 90;
        TextView textView5 = (TextView) m13886d1(R.id.txtNumberVoice);
        Intrinsics2.m13088d(textView5, "txtNumberVoice");
        textView5.setText(String.valueOf(iIntValue2));
        SeekBar seekBar4 = (SeekBar) m13886d1(R.id.seekBarVoice);
        Intrinsics2.m13088d(seekBar4, "seekBarVoice");
        seekBar4.setProgress(iIntValue2);
        ((SeekBar) m13886d1(R.id.seekBarVoice)).setOnSeekBarChangeListener(new e());
        b bVar = this.f30998t0;
        if (bVar != null) {
            SeekBar seekBar5 = (SeekBar) m13886d1(R.id.seekBarMusic);
            Intrinsics2.m13088d(seekBar5, "seekBarMusic");
            int progress = seekBar5.getProgress();
            SeekBar seekBar6 = (SeekBar) m13886d1(R.id.seekBarVoice);
            Intrinsics2.m13088d(seekBar6, "seekBarVoice");
            bVar.mo13887q(progress, seekBar6.getProgress());
        }
    }
}
