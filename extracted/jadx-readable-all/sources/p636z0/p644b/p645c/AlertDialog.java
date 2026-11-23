package p636z0.p644b.p645c;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.core.widget.NestedScrollView;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import p636z0.p644b.p653h.LinearLayoutCompat;
import p636z0.p725k.p739l.ViewCompat;

/* JADX INFO: renamed from: z0.b.c.g, reason: use source file name */
/* JADX INFO: compiled from: AlertDialog.java */
/* JADX INFO: loaded from: classes.dex */
public class AlertDialog extends AppCompatDialog implements DialogInterface {
    public static final int LAYOUT_HINT_NONE = 0;
    public static final int LAYOUT_HINT_SIDE = 1;
    public final AlertController mAlert;

    /* JADX INFO: renamed from: z0.b.c.g$a */
    /* JADX INFO: compiled from: AlertDialog.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final AlertController.C0050b f34424a;

        /* JADX INFO: renamed from: b */
        public final int f34425b;

        public a(Context context) {
            this(context, AlertDialog.resolveDialogTheme(context, 0));
        }

        /* JADX INFO: renamed from: a */
        public a mo11257a(boolean z) {
            this.f34424a.f233k = z;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public a mo11258b(CharSequence charSequence) {
            this.f34424a.f228f = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a mo11259c(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0050b c0050b = this.f34424a;
            c0050b.f231i = charSequence;
            c0050b.f232j = onClickListener;
            return this;
        }

        public AlertDialog create() {
            AlertDialog alertDialog = new AlertDialog(this.f34424a.f223a, this.f34425b);
            AlertController.C0050b c0050b = this.f34424a;
            AlertController alertController = alertDialog.mAlert;
            View view = c0050b.f227e;
            if (view != null) {
                alertController.f181G = view;
            } else {
                CharSequence charSequence = c0050b.f226d;
                if (charSequence != null) {
                    alertController.f198e = charSequence;
                    TextView textView = alertController.f179E;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                }
                Drawable drawable = c0050b.f225c;
                if (drawable != null) {
                    alertController.m140g(drawable);
                }
            }
            CharSequence charSequence2 = c0050b.f228f;
            if (charSequence2 != null) {
                alertController.f199f = charSequence2;
                TextView textView2 = alertController.f180F;
                if (textView2 != null) {
                    textView2.setText(charSequence2);
                }
            }
            CharSequence charSequence3 = c0050b.f229g;
            if (charSequence3 != null) {
                alertController.m138e(-1, charSequence3, c0050b.f230h, null, null);
            }
            CharSequence charSequence4 = c0050b.f231i;
            if (charSequence4 != null) {
                alertController.m138e(-2, charSequence4, c0050b.f232j, null, null);
            }
            if (c0050b.f235m != null || c0050b.f236n != null) {
                AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) c0050b.f224b.inflate(alertController.f186L, (ViewGroup) null);
                int i = c0050b.f240r ? alertController.f188N : alertController.f189O;
                ListAdapter c0052d = c0050b.f236n;
                if (c0052d == null) {
                    c0052d = new AlertController.C0052d(c0050b.f223a, i, R.id.text1, c0050b.f235m);
                }
                alertController.f182H = c0052d;
                alertController.f183I = c0050b.f241s;
                if (c0050b.f237o != null) {
                    recycleListView.setOnItemClickListener(new AlertController6(c0050b, alertController));
                }
                if (c0050b.f240r) {
                    recycleListView.setChoiceMode(1);
                }
                alertController.f200g = recycleListView;
            }
            View view2 = c0050b.f239q;
            if (view2 != null) {
                alertController.f201h = view2;
                alertController.f202i = 0;
                alertController.f207n = false;
            } else {
                int i2 = c0050b.f238p;
                if (i2 != 0) {
                    alertController.f201h = null;
                    alertController.f202i = i2;
                    alertController.f207n = false;
                }
            }
            alertDialog.setCancelable(this.f34424a.f233k);
            if (this.f34424a.f233k) {
                alertDialog.setCanceledOnTouchOutside(true);
            }
            Objects.requireNonNull(this.f34424a);
            alertDialog.setOnCancelListener(null);
            Objects.requireNonNull(this.f34424a);
            alertDialog.setOnDismissListener(null);
            DialogInterface.OnKeyListener onKeyListener = this.f34424a.f234l;
            if (onKeyListener != null) {
                alertDialog.setOnKeyListener(onKeyListener);
            }
            return alertDialog;
        }

        /* JADX INFO: renamed from: d */
        public a mo11260d(DialogInterface.OnKeyListener onKeyListener) {
            this.f34424a.f234l = onKeyListener;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public a mo11261e(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0050b c0050b = this.f34424a;
            c0050b.f229g = charSequence;
            c0050b.f230h = onClickListener;
            return this;
        }

        public Context getContext() {
            return this.f34424a.f223a;
        }

        public a setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0050b c0050b = this.f34424a;
            c0050b.f231i = c0050b.f223a.getText(i);
            this.f34424a.f232j = onClickListener;
            return this;
        }

        public a setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0050b c0050b = this.f34424a;
            c0050b.f229g = c0050b.f223a.getText(i);
            this.f34424a.f230h = onClickListener;
            return this;
        }

        public a setTitle(CharSequence charSequence) {
            this.f34424a.f226d = charSequence;
            return this;
        }

        public a setView(View view) {
            AlertController.C0050b c0050b = this.f34424a;
            c0050b.f239q = view;
            c0050b.f238p = 0;
            return this;
        }

        public a(Context context, int i) {
            this.f34424a = new AlertController.C0050b(new ContextThemeWrapper(context, AlertDialog.resolveDialogTheme(context, i)));
            this.f34425b = i;
        }
    }

    public AlertDialog(Context context) {
        this(context, 0);
    }

    public static int resolveDialogTheme(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(mtp.media.karaoke.R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public Button getButton(int i) {
        AlertController alertController = this.mAlert;
        Objects.requireNonNull(alertController);
        if (i == -3) {
            return alertController.f216w;
        }
        if (i == -2) {
            return alertController.f212s;
        }
        if (i != -1) {
            return null;
        }
        return alertController.f208o;
    }

    public ListView getListView() {
        return this.mAlert.f200g;
    }

    @Override // p636z0.p644b.p645c.AppCompatDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        int i;
        View view;
        ListAdapter listAdapter;
        View view2;
        View viewFindViewById;
        super.onCreate(bundle);
        AlertController alertController = this.mAlert;
        int i2 = alertController.f185K;
        if (i2 == 0 || alertController.f191Q != 1) {
            i2 = alertController.f184J;
        }
        alertController.f195b.setContentView(i2);
        View viewFindViewById2 = alertController.f196c.findViewById(mtp.media.karaoke.R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(mtp.media.karaoke.R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(mtp.media.karaoke.R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(mtp.media.karaoke.R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(mtp.media.karaoke.R.id.customPanel);
        View viewInflate = alertController.f201h;
        if (viewInflate == null) {
            viewInflate = alertController.f202i != 0 ? LayoutInflater.from(alertController.f194a).inflate(alertController.f202i, viewGroup, false) : null;
        }
        boolean z = viewInflate != null;
        if (!z || !AlertController.m134a(viewInflate)) {
            alertController.f196c.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) alertController.f196c.findViewById(mtp.media.karaoke.R.id.custom);
            frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
            if (alertController.f207n) {
                frameLayout.setPadding(alertController.f203j, alertController.f204k, alertController.f205l, alertController.f206m);
            }
            if (alertController.f200g != null) {
                ((LinearLayout.LayoutParams) ((LinearLayoutCompat.a) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View viewFindViewById6 = viewGroup.findViewById(mtp.media.karaoke.R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(mtp.media.karaoke.R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(mtp.media.karaoke.R.id.buttonPanel);
        ViewGroup viewGroupM137d = alertController.m137d(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupM137d2 = alertController.m137d(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupM137d3 = alertController.m137d(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) alertController.f196c.findViewById(mtp.media.karaoke.R.id.scrollView);
        alertController.f175A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        alertController.f175A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupM137d2.findViewById(R.id.message);
        alertController.f180F = textView;
        if (textView != null) {
            CharSequence charSequence = alertController.f199f;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                alertController.f175A.removeView(alertController.f180F);
                if (alertController.f200g != null) {
                    ViewGroup viewGroup2 = (ViewGroup) alertController.f175A.getParent();
                    int iIndexOfChild = viewGroup2.indexOfChild(alertController.f175A);
                    viewGroup2.removeViewAt(iIndexOfChild);
                    viewGroup2.addView(alertController.f200g, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    viewGroupM137d2.setVisibility(8);
                }
            }
        }
        Button button = (Button) viewGroupM137d3.findViewById(R.id.button1);
        alertController.f208o = button;
        button.setOnClickListener(alertController.f193S);
        if (TextUtils.isEmpty(alertController.f209p) && alertController.f211r == null) {
            alertController.f208o.setVisibility(8);
            i = 0;
        } else {
            alertController.f208o.setText(alertController.f209p);
            Drawable drawable = alertController.f211r;
            if (drawable != null) {
                int i3 = alertController.f197d;
                drawable.setBounds(0, 0, i3, i3);
                alertController.f208o.setCompoundDrawables(alertController.f211r, null, null, null);
            }
            alertController.f208o.setVisibility(0);
            i = 1;
        }
        Button button2 = (Button) viewGroupM137d3.findViewById(R.id.button2);
        alertController.f212s = button2;
        button2.setOnClickListener(alertController.f193S);
        if (TextUtils.isEmpty(alertController.f213t) && alertController.f215v == null) {
            alertController.f212s.setVisibility(8);
        } else {
            alertController.f212s.setText(alertController.f213t);
            Drawable drawable2 = alertController.f215v;
            if (drawable2 != null) {
                int i4 = alertController.f197d;
                drawable2.setBounds(0, 0, i4, i4);
                alertController.f212s.setCompoundDrawables(alertController.f215v, null, null, null);
            }
            alertController.f212s.setVisibility(0);
            i |= 2;
        }
        Button button3 = (Button) viewGroupM137d3.findViewById(R.id.button3);
        alertController.f216w = button3;
        button3.setOnClickListener(alertController.f193S);
        if (TextUtils.isEmpty(alertController.f217x) && alertController.f219z == null) {
            alertController.f216w.setVisibility(8);
            view = null;
        } else {
            alertController.f216w.setText(alertController.f217x);
            Drawable drawable3 = alertController.f219z;
            if (drawable3 != null) {
                int i5 = alertController.f197d;
                drawable3.setBounds(0, 0, i5, i5);
                view = null;
                alertController.f216w.setCompoundDrawables(alertController.f219z, null, null, null);
            } else {
                view = null;
            }
            alertController.f216w.setVisibility(0);
            i |= 4;
        }
        Context context = alertController.f194a;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(mtp.media.karaoke.R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                alertController.m136b(alertController.f208o);
            } else if (i == 2) {
                alertController.m136b(alertController.f212s);
            } else if (i == 4) {
                alertController.m136b(alertController.f216w);
            }
        }
        if (!(i != 0)) {
            viewGroupM137d3.setVisibility(8);
        }
        if (alertController.f181G != null) {
            viewGroupM137d.addView(alertController.f181G, 0, new ViewGroup.LayoutParams(-1, -2));
            alertController.f196c.findViewById(mtp.media.karaoke.R.id.title_template).setVisibility(8);
        } else {
            alertController.f178D = (ImageView) alertController.f196c.findViewById(R.id.icon);
            if ((!TextUtils.isEmpty(alertController.f198e)) && alertController.f190P) {
                TextView textView2 = (TextView) alertController.f196c.findViewById(mtp.media.karaoke.R.id.alertTitle);
                alertController.f179E = textView2;
                textView2.setText(alertController.f198e);
                int i6 = alertController.f176B;
                if (i6 != 0) {
                    alertController.f178D.setImageResource(i6);
                } else {
                    Drawable drawable4 = alertController.f177C;
                    if (drawable4 != null) {
                        alertController.f178D.setImageDrawable(drawable4);
                    } else {
                        alertController.f179E.setPadding(alertController.f178D.getPaddingLeft(), alertController.f178D.getPaddingTop(), alertController.f178D.getPaddingRight(), alertController.f178D.getPaddingBottom());
                        alertController.f178D.setVisibility(8);
                    }
                }
            } else {
                alertController.f196c.findViewById(mtp.media.karaoke.R.id.title_template).setVisibility(8);
                alertController.f178D.setVisibility(8);
                viewGroupM137d.setVisibility(8);
            }
        }
        boolean z2 = viewGroup.getVisibility() != 8;
        int i7 = (viewGroupM137d == null || viewGroupM137d.getVisibility() == 8) ? 0 : 1;
        boolean z3 = viewGroupM137d3.getVisibility() != 8;
        if (!z3 && (viewFindViewById = viewGroupM137d2.findViewById(mtp.media.karaoke.R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i7 != 0) {
            NestedScrollView nestedScrollView2 = alertController.f175A;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = (alertController.f199f == null && alertController.f200g == null) ? view : viewGroupM137d.findViewById(mtp.media.karaoke.R.id.titleDividerNoCustom);
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupM137d2.findViewById(mtp.media.karaoke.R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        ListView listView = alertController.f200g;
        if (listView instanceof AlertController.RecycleListView) {
            AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) listView;
            Objects.requireNonNull(recycleListView);
            if (!z3 || i7 == 0) {
                recycleListView.setPadding(recycleListView.getPaddingLeft(), i7 != 0 ? recycleListView.getPaddingTop() : recycleListView.f220f, recycleListView.getPaddingRight(), z3 ? recycleListView.getPaddingBottom() : recycleListView.f221g);
            }
        }
        if (!z2) {
            View view3 = alertController.f200g;
            if (view3 == null) {
                view3 = alertController.f175A;
            }
            if (view3 != null) {
                int i8 = i7 | (z3 ? 2 : 0);
                View viewFindViewById11 = alertController.f196c.findViewById(mtp.media.karaoke.R.id.scrollIndicatorUp);
                View viewFindViewById12 = alertController.f196c.findViewById(mtp.media.karaoke.R.id.scrollIndicatorDown);
                int i9 = Build.VERSION.SDK_INT;
                if (i9 >= 23) {
                    AtomicInteger atomicInteger = ViewCompat.f38073a;
                    if (i9 >= 23) {
                        view3.setScrollIndicators(i8, 3);
                    }
                    if (viewFindViewById11 != null) {
                        viewGroupM137d2.removeView(viewFindViewById11);
                    }
                    if (viewFindViewById12 != null) {
                        viewGroupM137d2.removeView(viewFindViewById12);
                    }
                } else {
                    if (viewFindViewById11 != null && (i8 & 1) == 0) {
                        viewGroupM137d2.removeView(viewFindViewById11);
                        viewFindViewById11 = view;
                    }
                    if (viewFindViewById12 == null || (i8 & 2) != 0) {
                        view2 = viewFindViewById12;
                    } else {
                        viewGroupM137d2.removeView(viewFindViewById12);
                        view2 = view;
                    }
                    if (viewFindViewById11 != null || view2 != null) {
                        if (alertController.f199f != null) {
                            alertController.f175A.setOnScrollChangeListener(new AlertController2(alertController, viewFindViewById11, view2));
                            alertController.f175A.post(new AlertController3(alertController, viewFindViewById11, view2));
                        } else {
                            ListView listView2 = alertController.f200g;
                            if (listView2 != null) {
                                listView2.setOnScrollListener(new AlertController4(alertController, viewFindViewById11, view2));
                                alertController.f200g.post(new AlertController5(alertController, viewFindViewById11, view2));
                            } else {
                                if (viewFindViewById11 != null) {
                                    viewGroupM137d2.removeView(viewFindViewById11);
                                }
                                if (view2 != null) {
                                    viewGroupM137d2.removeView(view2);
                                }
                            }
                        }
                    }
                }
            }
        }
        ListView listView3 = alertController.f200g;
        if (listView3 == null || (listAdapter = alertController.f182H) == null) {
            return;
        }
        listView3.setAdapter(listAdapter);
        int i10 = alertController.f183I;
        if (i10 > -1) {
            listView3.setItemChecked(i10, true);
            listView3.setSelection(i10);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.mAlert.f175A;
        if (nestedScrollView != null && nestedScrollView.m370i(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.mAlert.f175A;
        if (nestedScrollView != null && nestedScrollView.m370i(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public void setButton(int i, CharSequence charSequence, Message message) {
        this.mAlert.m138e(i, charSequence, null, message, null);
    }

    public void setButtonPanelLayoutHint(int i) {
        this.mAlert.f191Q = i;
    }

    public void setCustomTitle(View view) {
        this.mAlert.f181G = view;
    }

    public void setIcon(int i) {
        this.mAlert.m139f(i);
    }

    public void setIconAttribute(int i) {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(i, typedValue, true);
        this.mAlert.m139f(typedValue.resourceId);
    }

    public void setMessage(CharSequence charSequence) {
        AlertController alertController = this.mAlert;
        alertController.f199f = charSequence;
        TextView textView = alertController.f180F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // p636z0.p644b.p645c.AppCompatDialog, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AlertController alertController = this.mAlert;
        alertController.f198e = charSequence;
        TextView textView = alertController.f179E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void setView(View view) {
        AlertController alertController = this.mAlert;
        alertController.f201h = view;
        alertController.f202i = 0;
        alertController.f207n = false;
    }

    public AlertDialog(Context context, int i) {
        super(context, resolveDialogTheme(context, i));
        this.mAlert = new AlertController(getContext(), this, getWindow());
    }

    public void setButton(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.mAlert.m138e(i, charSequence, onClickListener, null, null);
    }

    public void setIcon(Drawable drawable) {
        this.mAlert.m140g(drawable);
    }

    public void setButton(int i, CharSequence charSequence, Drawable drawable, DialogInterface.OnClickListener onClickListener) {
        this.mAlert.m138e(i, charSequence, onClickListener, null, drawable);
    }

    public AlertDialog(Context context, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        this(context, 0);
        setCancelable(z);
        setOnCancelListener(onCancelListener);
    }

    public void setView(View view, int i, int i2, int i3, int i4) {
        AlertController alertController = this.mAlert;
        alertController.f201h = view;
        alertController.f202i = 0;
        alertController.f207n = true;
        alertController.f203j = i;
        alertController.f204k = i2;
        alertController.f205l = i3;
        alertController.f206m = i4;
    }
}
