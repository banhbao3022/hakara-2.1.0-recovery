package p555j.p556a.p557a.p558a.p559a.p560a;

import android.content.SharedPreferences;
import android.widget.SeekBar;
import android.widget.TextView;
import mtp.media.karaoke.R;
import mtp.media.karaoke.p628ui.screen.process.ProcessActivity;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p430e.GsonBuilder;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p606h.p609c.p612c.ModelPrefs;

/* JADX INFO: renamed from: j.a.a.a.a.a.q */
/* JADX INFO: compiled from: ProcessActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C6597q implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ProcessActivity f31031f;

    public C6597q(ProcessActivity processActivity) {
        this.f31031f = processActivity;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        Intrinsics2.m13089e(seekBar, "seekBar");
        TextView textView = (TextView) this.f31031f.m14407U(R.id.txtNumberRoomSize2);
        Intrinsics2.m13088d(textView, "txtNumberRoomSize2");
        textView.setText(String.valueOf(i));
        ProcessActivity processActivity = this.f31031f;
        SeekBar seekBar2 = (SeekBar) processActivity.m14407U(R.id.seekBarReverb2);
        Intrinsics2.m13088d(seekBar2, "seekBarReverb2");
        processActivity.processingCustomReverb(seekBar2.getProgress(), i);
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
