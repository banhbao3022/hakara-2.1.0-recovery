package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;
import mtp.media.karaoke.R;
import p636z0.p644b.C7463b;
import p636z0.p644b.p645c.AppCompatDialog;

/* JADX INFO: loaded from: classes.dex */
public class AlertController {

    /* JADX INFO: renamed from: A */
    public NestedScrollView f175A;

    /* JADX INFO: renamed from: C */
    public Drawable f177C;

    /* JADX INFO: renamed from: D */
    public ImageView f178D;

    /* JADX INFO: renamed from: E */
    public TextView f179E;

    /* JADX INFO: renamed from: F */
    public TextView f180F;

    /* JADX INFO: renamed from: G */
    public View f181G;

    /* JADX INFO: renamed from: H */
    public ListAdapter f182H;

    /* JADX INFO: renamed from: J */
    public int f184J;

    /* JADX INFO: renamed from: K */
    public int f185K;

    /* JADX INFO: renamed from: L */
    public int f186L;

    /* JADX INFO: renamed from: M */
    public int f187M;

    /* JADX INFO: renamed from: N */
    public int f188N;

    /* JADX INFO: renamed from: O */
    public int f189O;

    /* JADX INFO: renamed from: P */
    public boolean f190P;

    /* JADX INFO: renamed from: R */
    public Handler f192R;

    /* JADX INFO: renamed from: a */
    public final Context f194a;

    /* JADX INFO: renamed from: b */
    public final AppCompatDialog f195b;

    /* JADX INFO: renamed from: c */
    public final Window f196c;

    /* JADX INFO: renamed from: d */
    public final int f197d;

    /* JADX INFO: renamed from: e */
    public CharSequence f198e;

    /* JADX INFO: renamed from: f */
    public CharSequence f199f;

    /* JADX INFO: renamed from: g */
    public ListView f200g;

    /* JADX INFO: renamed from: h */
    public View f201h;

    /* JADX INFO: renamed from: i */
    public int f202i;

    /* JADX INFO: renamed from: j */
    public int f203j;

    /* JADX INFO: renamed from: k */
    public int f204k;

    /* JADX INFO: renamed from: l */
    public int f205l;

    /* JADX INFO: renamed from: m */
    public int f206m;

    /* JADX INFO: renamed from: o */
    public Button f208o;

    /* JADX INFO: renamed from: p */
    public CharSequence f209p;

    /* JADX INFO: renamed from: q */
    public Message f210q;

    /* JADX INFO: renamed from: r */
    public Drawable f211r;

    /* JADX INFO: renamed from: s */
    public Button f212s;

    /* JADX INFO: renamed from: t */
    public CharSequence f213t;

    /* JADX INFO: renamed from: u */
    public Message f214u;

    /* JADX INFO: renamed from: v */
    public Drawable f215v;

    /* JADX INFO: renamed from: w */
    public Button f216w;

    /* JADX INFO: renamed from: x */
    public CharSequence f217x;

    /* JADX INFO: renamed from: y */
    public Message f218y;

    /* JADX INFO: renamed from: z */
    public Drawable f219z;

    /* JADX INFO: renamed from: n */
    public boolean f207n = false;

    /* JADX INFO: renamed from: B */
    public int f176B = 0;

    /* JADX INFO: renamed from: I */
    public int f183I = -1;

    /* JADX INFO: renamed from: Q */
    public int f191Q = 0;

    /* JADX INFO: renamed from: S */
    public final View.OnClickListener f193S = new ViewOnClickListenerC0049a();

    public static class RecycleListView extends ListView {

        /* JADX INFO: renamed from: f */
        public final int f220f;

        /* JADX INFO: renamed from: g */
        public final int f221g;

        public RecycleListView(Context context) {
            this(context, null);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7463b.f34403s);
            this.f221g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
            this.f220f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$a */
    public class ViewOnClickListenerC0049a implements View.OnClickListener {
        public ViewOnClickListenerC0049a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message messageObtain;
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            if (view == alertController.f208o && (message3 = alertController.f210q) != null) {
                messageObtain = Message.obtain(message3);
            } else if (view != alertController.f212s || (message2 = alertController.f214u) == null) {
                messageObtain = (view != alertController.f216w || (message = alertController.f218y) == null) ? null : Message.obtain(message);
            } else {
                messageObtain = Message.obtain(message2);
            }
            if (messageObtain != null) {
                messageObtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.f192R.obtainMessage(1, alertController2.f195b).sendToTarget();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$b */
    public static class C0050b {

        /* JADX INFO: renamed from: a */
        public final Context f223a;

        /* JADX INFO: renamed from: b */
        public final LayoutInflater f224b;

        /* JADX INFO: renamed from: c */
        public Drawable f225c;

        /* JADX INFO: renamed from: d */
        public CharSequence f226d;

        /* JADX INFO: renamed from: e */
        public View f227e;

        /* JADX INFO: renamed from: f */
        public CharSequence f228f;

        /* JADX INFO: renamed from: g */
        public CharSequence f229g;

        /* JADX INFO: renamed from: h */
        public DialogInterface.OnClickListener f230h;

        /* JADX INFO: renamed from: i */
        public CharSequence f231i;

        /* JADX INFO: renamed from: j */
        public DialogInterface.OnClickListener f232j;

        /* JADX INFO: renamed from: l */
        public DialogInterface.OnKeyListener f234l;

        /* JADX INFO: renamed from: m */
        public CharSequence[] f235m;

        /* JADX INFO: renamed from: n */
        public ListAdapter f236n;

        /* JADX INFO: renamed from: o */
        public DialogInterface.OnClickListener f237o;

        /* JADX INFO: renamed from: p */
        public int f238p;

        /* JADX INFO: renamed from: q */
        public View f239q;

        /* JADX INFO: renamed from: r */
        public boolean f240r;

        /* JADX INFO: renamed from: s */
        public int f241s = -1;

        /* JADX INFO: renamed from: k */
        public boolean f233k = true;

        public C0050b(Context context) {
            this.f223a = context;
            this.f224b = (LayoutInflater) context.getSystemService("layout_inflater");
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$c */
    public static final class HandlerC0051c extends Handler {

        /* JADX INFO: renamed from: a */
        public WeakReference<DialogInterface> f242a;

        public HandlerC0051c(DialogInterface dialogInterface) {
            this.f242a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f242a.get(), message.what);
            } else {
                if (i != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$d */
    public static class C0052d extends ArrayAdapter<CharSequence> {
        public C0052d(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, AppCompatDialog appCompatDialog, Window window) {
        this.f194a = context;
        this.f195b = appCompatDialog;
        this.f196c = window;
        this.f192R = new HandlerC0051c(appCompatDialog);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, C7463b.f34389e, R.attr.alertDialogStyle, 0);
        this.f184J = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.f185K = typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.f186L = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f187M = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f188N = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.f189O = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.f190P = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.f197d = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        appCompatDialog.supportRequestWindowFeature(1);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m134a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m134a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static void m135c(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m136b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: d */
    public final ViewGroup m137d(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* JADX INFO: renamed from: e */
    public void m138e(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f192R.obtainMessage(i, onClickListener);
        }
        if (i == -3) {
            this.f217x = charSequence;
            this.f218y = message;
            this.f219z = drawable;
        } else if (i == -2) {
            this.f213t = charSequence;
            this.f214u = message;
            this.f215v = drawable;
        } else {
            if (i != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f209p = charSequence;
            this.f210q = message;
            this.f211r = drawable;
        }
    }

    /* JADX INFO: renamed from: f */
    public void m139f(int i) {
        this.f177C = null;
        this.f176B = i;
        ImageView imageView = this.f178D;
        if (imageView != null) {
            if (i == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f178D.setImageResource(this.f176B);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void m140g(Drawable drawable) {
        this.f177C = drawable;
        this.f176B = 0;
        ImageView imageView = this.f178D;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.f178D.setImageDrawable(drawable);
            }
        }
    }
}
