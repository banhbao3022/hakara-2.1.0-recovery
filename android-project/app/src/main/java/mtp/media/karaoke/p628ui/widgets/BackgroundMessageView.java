package mtp.media.karaoke.p628ui.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashMap;
import mtp.media.karaoke.R;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p558a.p596f.BackgroundMessageView2;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;

/* JADX INFO: compiled from: BackgroundMessageView.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class BackgroundMessageView extends LinearLayout {

    /* JADX INFO: renamed from: f */
    public HashMap f34043f;

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.widgets.BackgroundMessageView$a */
    /* JADX INFO: compiled from: BackgroundMessageView.kt */
    public static final class C7386a extends Lambda implements InterfaceC6164l<View, Unit> {

        /* JADX INFO: renamed from: g */
        public static final C7386a f34044g = new C7386a();

        public C7386a() {
            super(1);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6164l
        /* JADX INFO: renamed from: b */
        public Unit mo3b(View view) {
            Intrinsics2.m13089e(view, "it");
            return Unit.f29502a;
        }
    }

    public BackgroundMessageView(Context context) {
        this(context, null, 0, 6, null);
    }

    public BackgroundMessageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ BackgroundMessageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: a */
    public View m14470a(int i) {
        if (this.f34043f == null) {
            this.f34043f = new HashMap();
        }
        View view = (View) this.f34043f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        this.f34043f.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    /* JADX INFO: renamed from: b */
    public final void m14471b(int i, int i2, InterfaceC6164l<? super View, Unit> interfaceC6164l) {
        ((TextView) m14470a(R.id.messageTextView)).setText(i2);
        ((TextView) m14470a(R.id.messageTextView)).setCompoundDrawablesWithIntrinsicBounds(0, i, 0, 0);
        Button button = (Button) m14470a(R.id.button);
        Object backgroundMessageView2 = interfaceC6164l;
        if (interfaceC6164l != null) {
            backgroundMessageView2 = new BackgroundMessageView2(interfaceC6164l);
        }
        button.setOnClickListener((View.OnClickListener) backgroundMessageView2);
        Button button2 = (Button) m14470a(R.id.button);
        Intrinsics2.m13088d(button2, "button");
        SkuDao.a.m14061M(button2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundMessageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics2.m13089e(context, "context");
        View.inflate(context, R.layout.view_background_message, this);
        setOrientation(1);
        if (isInEditMode()) {
            m14471b(R.drawable.ic_network_fail, R.string.error_network, C7386a.f34044g);
        }
    }
}
