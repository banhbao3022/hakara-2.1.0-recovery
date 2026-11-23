package p007c.p190n.p194b.p266d.p267a.p282z.p283a;

import android.R;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import p007c.p190n.p194b.p266d.p314j.p315a.C3331nn;
import p007c.p190n.p194b.p266d.p314j.p315a.gx2;

/* JADX INFO: renamed from: c.n.b.d.a.z.a.t */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC2237t extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: f */
    public final ImageButton f10681f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC2218b f10682g;

    public ViewOnClickListenerC2237t(Context context, C2236s c2236s, InterfaceC2218b interfaceC2218b) {
        super(context);
        this.f10682g = interfaceC2218b;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(context);
        this.f10681f = imageButton;
        imageButton.setImageResource(R.drawable.btn_dialog);
        imageButton.setBackgroundColor(0);
        imageButton.setOnClickListener(this);
        gx2 gx2Var = gx2.f14692a;
        C3331nn c3331nn = gx2Var.f14693b;
        int iM7886d = C3331nn.m7886d(context.getResources().getDisplayMetrics(), c2236s.f10677a);
        C3331nn c3331nn2 = gx2Var.f14693b;
        int iM7886d2 = C3331nn.m7886d(context.getResources().getDisplayMetrics(), 0);
        C3331nn c3331nn3 = gx2Var.f14693b;
        int iM7886d3 = C3331nn.m7886d(context.getResources().getDisplayMetrics(), c2236s.f10678b);
        C3331nn c3331nn4 = gx2Var.f14693b;
        imageButton.setPadding(iM7886d, iM7886d2, iM7886d3, C3331nn.m7886d(context.getResources().getDisplayMetrics(), c2236s.f10679c));
        imageButton.setContentDescription("Interstitial close button");
        C3331nn c3331nn5 = gx2Var.f14693b;
        int iM7886d4 = C3331nn.m7886d(context.getResources().getDisplayMetrics(), c2236s.f10680d + c2236s.f10677a + c2236s.f10678b);
        C3331nn c3331nn6 = gx2Var.f14693b;
        addView(imageButton, new FrameLayout.LayoutParams(iM7886d4, C3331nn.m7886d(context.getResources().getDisplayMetrics(), c2236s.f10680d + c2236s.f10679c), 17));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC2218b interfaceC2218b = this.f10682g;
        if (interfaceC2218b != null) {
            interfaceC2218b.mo4669e();
        }
    }
}
