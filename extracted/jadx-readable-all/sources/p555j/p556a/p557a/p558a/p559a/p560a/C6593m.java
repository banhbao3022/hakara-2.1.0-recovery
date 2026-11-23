package p555j.p556a.p557a.p558a.p559a.p560a;

import android.widget.TextView;
import com.arthenica.mobileffmpeg.Config;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import mtp.media.karaoke.R;
import mtp.media.karaoke.p628ui.screen.process.ProcessActivity;
import p007c.p071d.p078c.p079a.outline;
import p007c.p080e.p081a.ExecuteCallback;
import p007c.p080e.p081a.FFmpeg;
import p477d1.p493x.p495c.Intrinsics2;
import p636z0.p667e.p676b.C7804v0;

/* JADX INFO: renamed from: j.a.a.a.a.a.m */
/* JADX INFO: compiled from: ProcessActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C6593m implements ExecuteCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ProcessActivity f31025a;

    public C6593m(ProcessActivity processActivity) {
        this.f31025a = processActivity;
    }

    @Override // p007c.p080e.p081a.ExecuteCallback
    /* JADX INFO: renamed from: a */
    public final void mo1605a(long j2, int i) {
        String strGroup;
        if (i != 0) {
            return;
        }
        this.f31025a.f33745X = false;
        float f = 0.0f;
        Matcher matcher = Pattern.compile("mean_volume:\\s([^\"]+?)\\sdB").matcher(Config.m12559b());
        if (matcher.find() && (strGroup = matcher.group(1)) != null) {
            float f2 = Float.parseFloat(strGroup);
            float fAbs = Math.abs(f2) - 14;
            Intrinsics2.m13089e("mean_volume: " + f2, "message");
            Intrinsics2.m13089e("vol increase: " + fAbs, "message");
            f = fAbs;
        }
        ProcessActivity processActivity = this.f31025a;
        if (!processActivity.f33758k0) {
            TextView textView = (TextView) processActivity.m14407U(R.id.txtMessageProgress);
            Intrinsics2.m13088d(textView, "txtMessageProgress");
            textView.setText(processActivity.getString(R.string.message_processing_converting));
            File file = new File(processActivity.f33729H, Intrinsics2.m13094j(processActivity.f33768z, C7804v0.m15335x(5)));
            File file2 = new File(processActivity.f33729H, Intrinsics2.m13094j(processActivity.f33768z, C7804v0.m15335x(3)));
            StringBuilder sbM1556G = outline.m1556G("-i ");
            sbM1556G.append(file.getPath());
            sbM1556G.append(" -y ");
            sbM1556G.append(file2.getPath());
            String string = sbM1556G.toString();
            if (f > 0) {
                StringBuilder sbM1556G2 = outline.m1556G("-i ");
                sbM1556G2.append(file.getPath());
                sbM1556G2.append(" -af volume=");
                sbM1556G2.append(f);
                sbM1556G2.append("dB -y ");
                sbM1556G2.append(file2.getPath());
                string = sbM1556G2.toString();
            }
            Intrinsics2.m13089e(string, "message");
            FFmpeg.m1606a(string, new C6595o(processActivity));
            return;
        }
        if (processActivity.f33759l0 != 2) {
            String str = processActivity.f33726E;
            String str2 = processActivity.f33730I;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f31025a.f33729H);
            sb.append("/");
            processActivity.m14409b0(f, str, str2, outline.m1604z(sb, this.f31025a.f33768z, 6));
            return;
        }
        TextView textView2 = (TextView) processActivity.m14407U(R.id.txtMessageProgress);
        Intrinsics2.m13088d(textView2, "txtMessageProgress");
        textView2.setText(processActivity.getString(R.string.message_processing_combine_video));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(processActivity.f33723B);
        sb2.append("/");
        String strM1604z = outline.m1604z(sb2, processActivity.f33768z, 6);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(processActivity.f33725D);
        sb3.append("/");
        String strM1551B = outline.m1551B(sb3, processActivity.f33768z, "-combine", 6);
        if (!new File(strM1551B).exists()) {
            FFmpeg.m1606a(outline.m1552C(outline.m1562M("-i ", strM1604z, " -i "), processActivity.f33726E, " -filter_complex hstack=inputs=2:shortest=1 -vsync 2 -y ", strM1551B), new C6594n(processActivity, f, strM1551B));
            return;
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(processActivity.f33729H);
        sb4.append("/");
        String strM1604z2 = outline.m1604z(sb4, processActivity.f33768z, 5);
        StringBuilder sb5 = new StringBuilder();
        sb5.append(processActivity.f33729H);
        sb5.append("/");
        processActivity.m14409b0(f, strM1551B, strM1604z2, outline.m1604z(sb5, processActivity.f33768z, 6));
    }
}
