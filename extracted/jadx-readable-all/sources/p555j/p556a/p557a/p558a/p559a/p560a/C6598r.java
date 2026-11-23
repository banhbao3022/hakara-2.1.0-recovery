package p555j.p556a.p557a.p558a.p559a.p560a;

import android.widget.TextView;
import com.facebook.stetho.websocket.CloseCodes;
import mtp.media.karaoke.R;
import mtp.media.karaoke.p628ui.screen.process.ProcessActivity;
import mtp.media.karaoke.p628ui.widgets.CircleProgressBar;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;

/* JADX INFO: renamed from: j.a.a.a.a.a.r */
/* JADX INFO: compiled from: ProcessActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C6598r extends Lambda implements InterfaceC6164l<ProcessActivity, Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C6599s.a f31032g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f31033h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6598r(C6599s.a aVar, int i) {
        super(1);
        this.f31032g = aVar;
        this.f31033h = i;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6164l
    /* JADX INFO: renamed from: b */
    public Unit mo3b(ProcessActivity processActivity) {
        Intrinsics2.m13089e(processActivity, "it");
        ProcessActivity processActivity2 = C6599s.this.f31034a;
        int i = processActivity2.f33737P;
        if (i > 0 && !processActivity2.f33745X && !processActivity2.f33762o0) {
            int i2 = (this.f31033h * 100) / (i * CloseCodes.NORMAL_CLOSURE);
            if (i2 != 100 || processActivity2.f33744W) {
                TextView textView = (TextView) processActivity2.m14407U(R.id.txtProgress);
                Intrinsics2.m13088d(textView, "txtProgress");
                StringBuilder sb = new StringBuilder();
                sb.append(i2);
                sb.append('%');
                textView.setText(sb.toString());
                ProcessActivity processActivity3 = C6599s.this.f31034a;
                if (processActivity3.f33759l0 == 0) {
                    i2 += 10;
                }
                ((CircleProgressBar) processActivity3.m14407U(R.id.processProgressBar)).setProgressWithAnimation(i2 <= 100 ? i2 : 100);
            } else {
                processActivity2.f33744W = true;
            }
        }
        return Unit.f29502a;
    }
}
