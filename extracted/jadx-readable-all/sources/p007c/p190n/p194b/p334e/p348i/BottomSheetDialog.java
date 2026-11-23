package p007c.p190n.p194b.p334e.p348i;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p636z0.p644b.p645c.AppCompatDialog;
import p636z0.p725k.p739l.AccessibilityDelegateCompat;
import p636z0.p725k.p739l.ViewCompat;
import p636z0.p725k.p739l.p740b0.AccessibilityNodeInfoCompat;

/* JADX INFO: renamed from: c.n.b.e.i.d, reason: use source file name */
/* JADX INFO: compiled from: BottomSheetDialog.java */
/* JADX INFO: loaded from: classes.dex */
public class BottomSheetDialog extends AppCompatDialog {

    /* JADX INFO: renamed from: f */
    public BottomSheetBehavior<FrameLayout> f25059f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f25060g;

    /* JADX INFO: renamed from: h */
    public boolean f25061h;

    /* JADX INFO: renamed from: i */
    public boolean f25062i;

    /* JADX INFO: renamed from: j */
    public boolean f25063j;

    /* JADX INFO: renamed from: k */
    public BottomSheetBehavior.AbstractC5926c f25064k;

    /* JADX INFO: renamed from: c.n.b.e.i.d$a */
    /* JADX INFO: compiled from: BottomSheetDialog.java */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BottomSheetDialog bottomSheetDialog = BottomSheetDialog.this;
            if (bottomSheetDialog.f25061h && bottomSheetDialog.isShowing()) {
                BottomSheetDialog bottomSheetDialog2 = BottomSheetDialog.this;
                if (!bottomSheetDialog2.f25063j) {
                    TypedArray typedArrayObtainStyledAttributes = bottomSheetDialog2.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                    bottomSheetDialog2.f25062i = typedArrayObtainStyledAttributes.getBoolean(0, true);
                    typedArrayObtainStyledAttributes.recycle();
                    bottomSheetDialog2.f25063j = true;
                }
                if (bottomSheetDialog2.f25062i) {
                    BottomSheetDialog.this.cancel();
                }
            }
        }
    }

    /* JADX INFO: renamed from: c.n.b.e.i.d$b */
    /* JADX INFO: compiled from: BottomSheetDialog.java */
    public class b extends AccessibilityDelegateCompat {
        public b() {
        }

        @Override // p636z0.p725k.p739l.AccessibilityDelegateCompat
        /* JADX INFO: renamed from: d */
        public void mo382d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            this.f37977b.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.f38018b);
            if (!BottomSheetDialog.this.f25061h) {
                accessibilityNodeInfoCompat.f38018b.setDismissable(false);
            } else {
                accessibilityNodeInfoCompat.f38018b.addAction(1048576);
                accessibilityNodeInfoCompat.f38018b.setDismissable(true);
            }
        }

        @Override // p636z0.p725k.p739l.AccessibilityDelegateCompat
        /* JADX INFO: renamed from: g */
        public boolean mo383g(View view, int i, Bundle bundle) {
            if (i == 1048576) {
                BottomSheetDialog bottomSheetDialog = BottomSheetDialog.this;
                if (bottomSheetDialog.f25061h) {
                    bottomSheetDialog.cancel();
                    return true;
                }
            }
            return super.mo383g(view, i, bundle);
        }
    }

    /* JADX INFO: renamed from: c.n.b.e.i.d$c */
    /* JADX INFO: compiled from: BottomSheetDialog.java */
    public class c implements View.OnTouchListener {
        public c(BottomSheetDialog bottomSheetDialog) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* JADX INFO: renamed from: c.n.b.e.i.d$d */
    /* JADX INFO: compiled from: BottomSheetDialog.java */
    public class d extends BottomSheetBehavior.AbstractC5926c {
        public d() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC5926c
        /* JADX INFO: renamed from: a */
        public void mo11124a(View view, float f) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC5926c
        /* JADX INFO: renamed from: b */
        public void mo11125b(View view, int i) {
            if (i == 5) {
                BottomSheetDialog.this.cancel();
            }
        }
    }

    public BottomSheetDialog(Context context) {
        this(context, 0);
    }

    /* JADX INFO: renamed from: a */
    public final FrameLayout m11122a() {
        if (this.f25060g == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), mtp.media.karaoke.R.layout.design_bottom_sheet_dialog, null);
            this.f25060g = frameLayout;
            ViewGroup.LayoutParams layoutParams = ((FrameLayout) frameLayout.findViewById(mtp.media.karaoke.R.id.design_bottom_sheet)).getLayoutParams();
            if (!(layoutParams instanceof CoordinatorLayout.C0101f)) {
                throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
            }
            CoordinatorLayout.AbstractC0098c abstractC0098c = ((CoordinatorLayout.C0101f) layoutParams).f643a;
            if (!(abstractC0098c instanceof BottomSheetBehavior)) {
                throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
            }
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = (BottomSheetBehavior) abstractC0098c;
            this.f25059f = bottomSheetBehavior;
            BottomSheetBehavior.AbstractC5926c abstractC5926c = this.f25064k;
            if (!bottomSheetBehavior.f28829I.contains(abstractC5926c)) {
                bottomSheetBehavior.f28829I.add(abstractC5926c);
            }
            this.f25059f.m12738I(this.f25061h);
        }
        return this.f25060g;
    }

    /* JADX INFO: renamed from: b */
    public final View m11123b(int i, View view, ViewGroup.LayoutParams layoutParams) {
        m11122a();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f25060g.findViewById(mtp.media.karaoke.R.id.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        FrameLayout frameLayout = (FrameLayout) this.f25060g.findViewById(mtp.media.karaoke.R.id.design_bottom_sheet);
        frameLayout.removeAllViews();
        if (layoutParams == null) {
            frameLayout.addView(view);
        } else {
            frameLayout.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(mtp.media.karaoke.R.id.touch_outside).setOnClickListener(new a());
        ViewCompat.m16327u(frameLayout, new b());
        frameLayout.setOnTouchListener(new c(this));
        return this.f25060g;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        if (this.f25059f == null) {
            m11122a();
        }
        super.cancel();
    }

    @Override // p636z0.p644b.p645c.AppCompatDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f25059f;
        if (bottomSheetBehavior == null || bottomSheetBehavior.f28861y != 5) {
            return;
        }
        bottomSheetBehavior.m12740K(4);
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.f25061h != z) {
            this.f25061h = z;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f25059f;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.m12738I(z);
            }
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.f25061h) {
            this.f25061h = true;
        }
        this.f25062i = z;
        this.f25063j = true;
    }

    @Override // p636z0.p644b.p645c.AppCompatDialog, android.app.Dialog
    public void setContentView(int i) {
        super.setContentView(m11123b(i, null, null));
    }

    public BottomSheetDialog(Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            i = context.getTheme().resolveAttribute(mtp.media.karaoke.R.attr.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : 2132017655;
        }
        super(context, i);
        this.f25061h = true;
        this.f25062i = true;
        this.f25064k = new d();
        supportRequestWindowFeature(1);
    }

    @Override // p636z0.p644b.p645c.AppCompatDialog, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(m11123b(0, view, null));
    }

    @Override // p636z0.p644b.p645c.AppCompatDialog, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(m11123b(0, view, layoutParams));
    }
}
