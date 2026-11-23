package p555j.p556a.p557a.p558a.p559a.p560a;

import android.content.SharedPreferences;
import android.widget.SeekBar;
import android.widget.TextView;
import mtp.media.karaoke.R;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p430e.GsonBuilder;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p606h.p609c.p612c.ModelPrefs;

/* JADX INFO: renamed from: j.a.a.a.a.a.f, reason: use source file name */
/* JADX INFO: compiled from: EffectFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class EffectFragment3 implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ EffectFragment f30992f;

    public EffectFragment3(EffectFragment effectFragment) {
        this.f30992f = effectFragment;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        Intrinsics2.m13089e(seekBar, "seekBar");
        TextView textView = (TextView) this.f30992f.m13869d1(R.id.txtNumberRoomSize);
        Intrinsics2.m13088d(textView, "txtNumberRoomSize");
        textView.setText(String.valueOf(i));
        EffectFragment effectFragment = this.f30992f;
        EffectFragment.c cVar = effectFragment.f30960t0;
        if (cVar != null) {
            SeekBar seekBar2 = (SeekBar) effectFragment.m13869d1(R.id.seekBarReverb);
            Intrinsics2.m13088d(seekBar2, "seekBarReverb");
            int progress = seekBar2.getProgress();
            SeekBar seekBar3 = (SeekBar) this.f30992f.m13869d1(R.id.seekBarRoomSize);
            Intrinsics2.m13088d(seekBar3, "seekBarRoomSize");
            cVar.mo13873v(progress, seekBar3.getProgress());
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
        Intrinsics2.m13089e(seekBar, "seekBar");
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        Intrinsics2.m13089e(seekBar, "seekBar");
        Integer numValueOf = Integer.valueOf(seekBar.getProgress());
        Intrinsics2.m13089e("reverb_room_size", "key");
        String strM12319f = new GsonBuilder().m12322a().m12319f(numValueOf);
        SharedPreferences sharedPreferences = ModelPrefs.f32358a;
        if (sharedPreferences != null) {
            outline.m1564O(sharedPreferences, "reverb_room_size", strM12319f);
        } else {
            Intrinsics2.m13096l("preferences");
            throw null;
        }
    }
}
