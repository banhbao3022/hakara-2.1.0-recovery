package p636z0.p644b.p653h;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.facebook.stetho.websocket.CloseCodes;
import mtp.media.karaoke.R;

/* JADX INFO: renamed from: z0.b.h.b1, reason: use source file name */
/* JADX INFO: compiled from: TooltipPopup.java */
/* JADX INFO: loaded from: classes.dex */
public class TooltipPopup {

    /* JADX INFO: renamed from: a */
    public final Context f34968a;

    /* JADX INFO: renamed from: b */
    public final View f34969b;

    /* JADX INFO: renamed from: c */
    public final TextView f34970c;

    /* JADX INFO: renamed from: d */
    public final WindowManager.LayoutParams f34971d;

    /* JADX INFO: renamed from: e */
    public final Rect f34972e;

    /* JADX INFO: renamed from: f */
    public final int[] f34973f;

    /* JADX INFO: renamed from: g */
    public final int[] f34974g;

    public TooltipPopup(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f34971d = layoutParams;
        this.f34972e = new Rect();
        this.f34973f = new int[2];
        this.f34974g = new int[2];
        this.f34968a = context;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.f34969b = viewInflate;
        this.f34970c = (TextView) viewInflate.findViewById(R.id.message);
        layoutParams.setTitle(TooltipPopup.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = CloseCodes.PROTOCOL_ERROR;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = 2132017157;
        layoutParams.flags = 24;
    }

    /* JADX INFO: renamed from: a */
    public void m14843a() {
        if (this.f34969b.getParent() != null) {
            ((WindowManager) this.f34968a.getSystemService("window")).removeView(this.f34969b);
        }
    }
}
