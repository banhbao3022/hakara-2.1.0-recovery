package p555j.p556a.p557a.p616i;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Task3;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p644b.p646d.p647a.AppCompatResources;
import p636z0.p748n.DataBindingComponent;
import p636z0.p748n.p749j.TextViewBindingAdapter;

/* JADX INFO: renamed from: j.a.a.i.n0, reason: use source file name */
/* JADX INFO: compiled from: ItemCheckinDayBindingImpl.java */
/* JADX INFO: loaded from: classes2.dex */
public class ItemCheckinDayBindingImpl extends ItemCheckinDayBinding {

    /* JADX INFO: renamed from: u */
    public static final SparseIntArray f32689u;

    /* JADX INFO: renamed from: A */
    public final TextView f32690A;

    /* JADX INFO: renamed from: B */
    public long f32691B;

    /* JADX INFO: renamed from: v */
    public final LinearLayout f32692v;

    /* JADX INFO: renamed from: w */
    public final LinearLayout f32693w;

    /* JADX INFO: renamed from: x */
    public final TextView f32694x;

    /* JADX INFO: renamed from: y */
    public final ImageView f32695y;

    /* JADX INFO: renamed from: z */
    public final ImageView f32696z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f32689u = sparseIntArray;
        sparseIntArray.put(R.id.layoutCongrats, 6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ItemCheckinDayBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrM391i = ViewDataBinding.m391i(dataBindingComponent, view, 7, null, f32689u);
        super(dataBindingComponent, view, 0, (RelativeLayout) objArrM391i[6]);
        this.f32691B = -1L;
        LinearLayout linearLayout = (LinearLayout) objArrM391i[0];
        this.f32692v = linearLayout;
        linearLayout.setTag(null);
        LinearLayout linearLayout2 = (LinearLayout) objArrM391i[1];
        this.f32693w = linearLayout2;
        linearLayout2.setTag(null);
        TextView textView = (TextView) objArrM391i[2];
        this.f32694x = textView;
        textView.setTag(null);
        ImageView imageView = (ImageView) objArrM391i[3];
        this.f32695y = imageView;
        imageView.setTag(null);
        ImageView imageView2 = (ImageView) objArrM391i[4];
        this.f32696z = imageView2;
        imageView2.setTag(null);
        TextView textView2 = (TextView) objArrM391i[5];
        this.f32690A = textView2;
        textView2.setTag(null);
        view.setTag(R.id.dataBinding, this);
        mo398f();
    }

    /* JADX WARN: Code duplicated, block: B:162:0x0235 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:163:0x0237  */
    /* JADX WARN: Code duplicated, block: B:164:0x0245  */
    /* JADX WARN: Code duplicated, block: B:167:0x024c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:168:0x024e  */
    /* JADX WARN: Code duplicated, block: B:169:0x0253  */
    /* JADX WARN: Code duplicated, block: B:171:0x0256  */
    /* JADX WARN: Code duplicated, block: B:173:0x025a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:174:0x025c  */
    /* JADX WARN: Code duplicated, block: B:175:0x025f  */
    /* JADX WARN: Code duplicated, block: B:179:0x026a  */
    /* JADX WARN: Code duplicated, block: B:180:0x026e  */
    /* JADX WARN: Code duplicated, block: B:182:0x0276  */
    /* JADX WARN: Code duplicated, block: B:185:0x027d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:186:0x027f  */
    /* JADX WARN: Code duplicated, block: B:187:0x028d  */
    /* JADX WARN: Code duplicated, block: B:190:0x0295 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:191:0x0297  */
    /* JADX WARN: Code duplicated, block: B:193:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:195:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:202:? A[RETURN, SYNTHETIC] */
    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: b */
    public void mo395b() {
        long j2;
        boolean z;
        int iM388d;
        boolean z2;
        String string;
        int day;
        String string2;
        int iM388d2;
        Drawable drawableM14707b;
        boolean z3;
        Drawable drawableM14707b2;
        long j3;
        Drawable drawableM14707b3;
        long j4;
        Drawable drawable;
        int diamonds;
        boolean z4;
        int i;
        long j5;
        int coins;
        int status;
        TextView textView;
        int i2;
        synchronized (this) {
            j2 = this.f32691B;
            this.f32691B = 0L;
        }
        Task3 task3 = this.f32671t;
        long j6 = 3 & j2;
        if (j6 != 0) {
            if (task3 != null) {
                coins = task3.getCoins();
                status = task3.getStatus();
            } else {
                coins = 0;
                status = 0;
            }
            string = Integer.toString(coins);
            z2 = status == 1;
            z = status == 2;
            if (j6 != 0) {
                j2 = z2 ? j2 | 8 | 32768 | 8388608 | 134217728 : j2 | 4 | 16384 | 4194304 | 67108864;
            }
            if ((j2 & 3) != 0) {
                j2 |= z ? 32L : 16L;
            }
            if ((j2 & 67108864) != 0) {
                j2 |= z ? 128L : 64L;
            }
            if ((16384 & j2) != 0) {
                j2 |= z ? 8192L : 4096L;
            }
            if (z) {
                textView = this.f32690A;
                i2 = R.color.checkIn_disable;
            } else {
                textView = this.f32690A;
                i2 = R.color.silver;
            }
            iM388d = ViewDataBinding.m388d(textView, i2);
        } else {
            z = false;
            iM388d = 0;
            z2 = false;
            string = null;
        }
        if ((4 & j2) != 0) {
            day = task3 != null ? task3.getDay() : 0;
            StringBuilder sbM1556G = outline.m1556G(outline.m1599u(Integer.toString(day), " "));
            sbM1556G.append(this.f32694x.getResources().getString(R.string.txt_day));
            string2 = sbM1556G.toString();
        } else {
            day = 0;
            string2 = null;
        }
        if ((j2 & 67108864) != 0) {
            iM388d2 = ViewDataBinding.m388d(this.f32694x, z ? R.color.checkIn_disable : R.color.header_color);
        } else {
            iM388d2 = 0;
        }
        if ((16384 & j2) != 0) {
            drawableM14707b = AppCompatResources.m14707b(this.f32693w.getContext(), z ? R.drawable.bg_border_checkin_day_disable : R.drawable.bg_border_checkin_day);
        } else {
            drawableM14707b = null;
        }
        long j7 = j2 & 3;
        if (j7 != 0) {
            if (z2) {
                z = true;
            }
            if (j7 != 0) {
                j2 = z ? j2 | 524288 | 2147483648L : j2 | 262144 | 1073741824;
            }
        } else {
            z = false;
        }
        if ((j2 & 3) != 0) {
            if (z2) {
                string2 = this.f32694x.getResources().getString(R.string.txt_today);
            }
            if (z2) {
                drawableM14707b = AppCompatResources.m14707b(this.f32693w.getContext(), R.drawable.bg_border_checkin_day_active);
            }
            if (z2) {
                iM388d2 = ViewDataBinding.m388d(this.f32694x, R.color.checkIn_active);
            }
        } else {
            iM388d2 = 0;
            string2 = null;
            drawableM14707b = null;
        }
        long j8 = j2 & 1074003968;
        if (j8 != 0) {
            if (task3 != null) {
                day = task3.getDay();
            }
            z3 = day == 7;
            if (j8 != 0) {
                j2 = z3 ? j2 | 536870912 : j2 | 268435456;
            }
        } else {
            z3 = false;
        }
        boolean z5 = (j2 & 268435456) != 0 && day == 14;
        long j9 = j2 & 1074003968;
        if (j9 != 0) {
            if (z3) {
                z5 = true;
            }
            if (j9 != 0) {
                j2 = z5 ? j2 | 2097152 : j2 | 1048576;
            }
        } else {
            z5 = false;
        }
        boolean z6 = (j2 & 1048576) != 0 && day == 21;
        long j10 = j2 & 1074003968;
        if (j10 != 0) {
            if (z5) {
                z6 = true;
            }
            if (j10 != 0) {
                j2 = z6 ? j2 | 2048 : j2 | 1024;
            }
        } else {
            z6 = false;
        }
        boolean z7 = (j2 & 1024) != 0 && day == 28;
        if ((1074003968 & j2) != 0) {
            if (z6) {
                z7 = true;
            }
            if ((262144 & j2) != 0) {
                j2 |= z7 ? 131072L : 65536L;
            }
            if ((j2 & 1073741824) != 0) {
                j2 = z7 ? j2 | 33554432 : j2 | 16777216;
            }
            if ((262144 & j2) != 0) {
                drawableM14707b2 = AppCompatResources.m14707b(this.f32695y.getContext(), z7 ? R.drawable.ic_congrat_gift : R.drawable.ic_congrat);
            }
            if ((3 & j2) != 0) {
                drawableM14707b2 = null;
            } else if (z) {
                drawableM14707b2 = AppCompatResources.m14707b(this.f32695y.getContext(), R.drawable.ic_congrat_active);
            }
            j3 = j2 & 16777216;
            if (j3 != 0) {
                if (task3 != null) {
                    diamonds = task3.getDiamonds();
                } else {
                    diamonds = 0;
                }
                z4 = diamonds > 0;
                if (j3 != 0) {
                    if (z4) {
                        j5 = 512;
                    } else {
                        j5 = 256;
                    }
                    j2 |= j5;
                }
                Context context = this.f32696z.getContext();
                if (z4) {
                    i = R.drawable.ic_checkin_coins_diamonds;
                } else {
                    i = R.drawable.ic_coin_silver;
                }
                drawableM14707b3 = AppCompatResources.m14707b(context, i);
            } else {
                drawableM14707b3 = null;
            }
            if ((j2 & 1073741824) != 0) {
                drawableM14707b3 = null;
            } else if (z7) {
                drawableM14707b3 = AppCompatResources.m14707b(this.f32696z.getContext(), R.drawable.ic_checkin_gift_large);
            }
            j4 = j2 & 3;
            if (j4 != 0) {
                if (z) {
                    drawableM14707b3 = AppCompatResources.m14707b(this.f32696z.getContext(), R.drawable.ic_privacy_option_checked);
                }
                drawable = drawableM14707b3;
            } else {
                drawable = null;
            }
            if (j4 != 0) {
                this.f32693w.setBackground(drawableM14707b);
                this.f32694x.setBackground(new ColorDrawable(iM388d2));
                TextViewBindingAdapter.m16406a(this.f32694x, string2);
                this.f32695y.setImageDrawable(drawableM14707b2);
                this.f32696z.setImageDrawable(drawable);
                TextViewBindingAdapter.m16406a(this.f32690A, string);
                this.f32690A.setTextColor(iM388d);
            }
        }
        z7 = false;
        drawableM14707b2 = null;
        if ((3 & j2) != 0) {
            drawableM14707b2 = null;
        } else if (z) {
            drawableM14707b2 = AppCompatResources.m14707b(this.f32695y.getContext(), R.drawable.ic_congrat_active);
        }
        j3 = j2 & 16777216;
        if (j3 != 0) {
            if (task3 != null) {
                diamonds = task3.getDiamonds();
            } else {
                diamonds = 0;
            }
            if (diamonds > 0) {
            }
            if (j3 != 0) {
                if (z4) {
                    j5 = 512;
                } else {
                    j5 = 256;
                }
                j2 |= j5;
            }
            Context context2 = this.f32696z.getContext();
            if (z4) {
                i = R.drawable.ic_checkin_coins_diamonds;
            } else {
                i = R.drawable.ic_coin_silver;
            }
            drawableM14707b3 = AppCompatResources.m14707b(context2, i);
        } else {
            drawableM14707b3 = null;
        }
        if ((j2 & 1073741824) != 0) {
            drawableM14707b3 = null;
        } else if (z7) {
            drawableM14707b3 = AppCompatResources.m14707b(this.f32696z.getContext(), R.drawable.ic_checkin_gift_large);
        }
        j4 = j2 & 3;
        if (j4 != 0) {
            if (z) {
                drawableM14707b3 = AppCompatResources.m14707b(this.f32696z.getContext(), R.drawable.ic_privacy_option_checked);
            }
            drawable = drawableM14707b3;
        } else {
            drawable = null;
        }
        if (j4 != 0) {
            this.f32693w.setBackground(drawableM14707b);
            this.f32694x.setBackground(new ColorDrawable(iM388d2));
            TextViewBindingAdapter.m16406a(this.f32694x, string2);
            this.f32695y.setImageDrawable(drawableM14707b2);
            this.f32696z.setImageDrawable(drawable);
            TextViewBindingAdapter.m16406a(this.f32690A, string);
            this.f32690A.setTextColor(iM388d);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: e */
    public boolean mo397e() {
        synchronized (this) {
            return this.f32691B != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: f */
    public void mo398f() {
        synchronized (this) {
            this.f32691B = 2L;
        }
        m401m();
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: j */
    public boolean mo399j(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: q */
    public boolean mo403q(int i, Object obj) {
        if (8 != i) {
            return false;
        }
        this.f32671t = (Task3) obj;
        synchronized (this) {
            this.f32691B |= 1;
        }
        m16396a(8);
        m401m();
        return true;
    }
}
