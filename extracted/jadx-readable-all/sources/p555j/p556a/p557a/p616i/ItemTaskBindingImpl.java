package p555j.p556a.p557a.p616i;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Task;
import mtp.media.karaoke.data.model.Task4;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p493x.p495c.Intrinsics2;
import p636z0.p644b.p646d.p647a.AppCompatResources;
import p636z0.p748n.DataBindingComponent;
import p636z0.p748n.p749j.TextViewBindingAdapter;

/* JADX INFO: renamed from: j.a.a.i.d2, reason: use source file name */
/* JADX INFO: compiled from: ItemTaskBindingImpl.java */
/* JADX INFO: loaded from: classes2.dex */
public class ItemTaskBindingImpl extends ItemTaskBinding {

    /* JADX INFO: renamed from: y */
    public static final SparseIntArray f32480y;

    /* JADX INFO: renamed from: A */
    public final LinearLayout f32481A;

    /* JADX INFO: renamed from: B */
    public final TextView f32482B;

    /* JADX INFO: renamed from: C */
    public final TextView f32483C;

    /* JADX INFO: renamed from: D */
    public final TextView f32484D;

    /* JADX INFO: renamed from: E */
    public final TextView f32485E;

    /* JADX INFO: renamed from: F */
    public final TextView f32486F;

    /* JADX INFO: renamed from: G */
    public final ImageView f32487G;

    /* JADX INFO: renamed from: H */
    public final TextView f32488H;

    /* JADX INFO: renamed from: I */
    public final ImageView f32489I;

    /* JADX INFO: renamed from: J */
    public long f32490J;

    /* JADX INFO: renamed from: z */
    public final CardView f32491z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f32480y = sparseIntArray;
        sparseIntArray.put(R.id.recyclerViewCheckIn, 13);
        sparseIntArray.put(R.id.layoutAction, 14);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ItemTaskBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrM391i = ViewDataBinding.m391i(dataBindingComponent, view, 15, null, f32480y);
        super(dataBindingComponent, view, 0, (TextView) objArrM391i[11], (AppCompatImageView) objArrM391i[4], (LinearLayout) objArrM391i[14], (RecyclerView) objArrM391i[13], (RelativeLayout) objArrM391i[3]);
        this.f32490J = -1L;
        this.f32450t.setTag(null);
        this.f32451u.setTag(null);
        CardView cardView = (CardView) objArrM391i[0];
        this.f32491z = cardView;
        cardView.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArrM391i[1];
        this.f32481A = linearLayout;
        linearLayout.setTag(null);
        TextView textView = (TextView) objArrM391i[10];
        this.f32482B = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArrM391i[12];
        this.f32483C = textView2;
        textView2.setTag(null);
        TextView textView3 = (TextView) objArrM391i[2];
        this.f32484D = textView3;
        textView3.setTag(null);
        TextView textView4 = (TextView) objArrM391i[5];
        this.f32485E = textView4;
        textView4.setTag(null);
        TextView textView5 = (TextView) objArrM391i[6];
        this.f32486F = textView5;
        textView5.setTag(null);
        ImageView imageView = (ImageView) objArrM391i[7];
        this.f32487G = imageView;
        imageView.setTag(null);
        TextView textView6 = (TextView) objArrM391i[8];
        this.f32488H = textView6;
        textView6.setTag(null);
        ImageView imageView2 = (ImageView) objArrM391i[9];
        this.f32489I = imageView2;
        imageView2.setTag(null);
        this.f32453w.setTag(null);
        view.setTag(R.id.dataBinding, this);
        mo398f();
    }

    /* JADX WARN: Code duplicated, block: B:145:0x025a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:146:0x025c  */
    /* JADX WARN: Code duplicated, block: B:148:0x025f  */
    /* JADX WARN: Code duplicated, block: B:149:0x026d  */
    /* JADX WARN: Code duplicated, block: B:151:0x0273 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:152:0x0275  */
    /* JADX WARN: Code duplicated, block: B:153:0x0279  */
    /* JADX WARN: Code duplicated, block: B:156:0x0280  */
    /* JADX WARN: Code duplicated, block: B:157:0x028a  */
    /* JADX WARN: Code duplicated, block: B:159:0x029a  */
    /* JADX WARN: Code duplicated, block: B:162:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:164:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:165:0x02af  */
    /* JADX WARN: Code duplicated, block: B:167:0x02b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:168:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:169:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:173:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:174:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:176:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:179:0x02d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:180:0x02da  */
    /* JADX WARN: Code duplicated, block: B:181:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:184:0x02f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:185:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:186:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:188:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:191:0x0314  */
    /* JADX WARN: Code duplicated, block: B:192:0x0323  */
    /* JADX WARN: Code duplicated, block: B:193:0x0332  */
    /* JADX WARN: Code duplicated, block: B:194:0x0341  */
    /* JADX WARN: Code duplicated, block: B:195:0x0350  */
    /* JADX WARN: Code duplicated, block: B:196:0x035f  */
    /* JADX WARN: Code duplicated, block: B:204:? A[RETURN, SYNTHETIC] */
    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: b */
    public void mo395b() {
        long j2;
        int i;
        int i2;
        int i3;
        int id;
        int i4;
        long j3;
        boolean z;
        String str;
        String str2;
        String strM1590l;
        int i5;
        String str3;
        String string;
        String string2;
        int i6;
        int i7;
        String string3;
        String str4;
        boolean z2;
        boolean z3;
        int iCheckLogStatus;
        int iM388d;
        long j4;
        long j5;
        Drawable drawableM14707b;
        int i8;
        long j6;
        String string4;
        long j7;
        AppCompatImageView appCompatImageView;
        boolean z4;
        int i9;
        long j8;
        Context context;
        int i10;
        long j9;
        TextView textView;
        int i11;
        Resources resources;
        int i12;
        int exp;
        int goal;
        int iCheckLogStatus2;
        int finishedCount;
        int diamond;
        int coin;
        Task4 log;
        String name;
        long j10;
        long j11;
        synchronized (this) {
            j2 = this.f32490J;
            this.f32490J = 0L;
        }
        Task task = this.f32454x;
        long j12 = j2 & 3;
        if (j12 != 0) {
            if (task != null) {
                exp = task.getExp();
                log = task.getLog();
                goal = task.getGoal();
                iCheckLogStatus2 = task.checkLogStatus();
                finishedCount = task.getFinishedCount();
                diamond = task.getDiamond();
                coin = task.getCoin();
                name = task.getName();
                int type = task.getType();
                id = task.getId();
                i3 = type;
            } else {
                exp = 0;
                id = 0;
                goal = 0;
                iCheckLogStatus2 = 0;
                finishedCount = 0;
                diamond = 0;
                coin = 0;
                log = null;
                i3 = 0;
                name = null;
            }
            boolean z5 = exp > 0;
            String string5 = Integer.toString(exp);
            boolean z6 = goal > 1;
            z = iCheckLogStatus2 == 1;
            String str5 = finishedCount + "/";
            boolean z7 = diamond > 0;
            string = Integer.toString(diamond);
            string2 = Integer.toString(coin);
            boolean z8 = i3 != 1;
            boolean z9 = i3 == 1;
            if (j12 != 0) {
                j2 |= z5 ? 8388608L : 4194304L;
            }
            if ((j2 & 3) != 0) {
                j2 |= z6 ? 2048L : 1024L;
            }
            if ((j2 & 3) != 0) {
                if (z) {
                    j10 = j2 | 32768 | 2097152;
                    j11 = 134217728;
                } else {
                    j10 = j2 | 16384 | 1048576;
                    j11 = 67108864;
                }
                j2 = j10 | j11;
            }
            if ((j2 & 3) != 0) {
                j2 |= z7 ? 8L : 4L;
            }
            if ((j2 & 3) != 0) {
                j2 |= z8 ? 32L : 16L;
            }
            if ((j2 & 3) != 0) {
                j2 |= z9 ? 512L : 256L;
            }
            Integer day = log != null ? log.getDay() : null;
            int i13 = z5 ? 0 : 8;
            int i14 = z6 ? 0 : 8;
            strM1590l = outline.m1590l(str5, goal);
            i = z7 ? 0 : 8;
            i4 = z8 ? 0 : 8;
            i2 = z9 ? 0 : 8;
            Object[] objArr = {day};
            j3 = 32768;
            str2 = string5;
            str3 = name;
            i6 = i13;
            str = String.format(this.f32484D.getResources().getString(R.string.txt_daily_check_in), objArr);
            i7 = iCheckLogStatus2;
            i5 = i14;
            j2 = j2;
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
            id = 0;
            i4 = 0;
            j3 = 32768;
            z = false;
            str = null;
            str2 = null;
            strM1590l = null;
            i5 = 0;
            str3 = null;
            string = null;
            string2 = null;
            i6 = 0;
            i7 = 0;
        }
        long j13 = j2 & j3;
        if (j13 != 0) {
            boolean z10 = i3 == 11;
            if (j13 != 0) {
                j2 |= z10 ? 128L : 64L;
            }
            if (z10) {
                resources = this.f32450t.getResources();
                i12 = R.string.txt_view;
            } else {
                resources = this.f32450t.getResources();
                i12 = R.string.txt_unfinished;
            }
            string3 = resources.getString(i12);
        } else {
            string3 = null;
        }
        if ((j2 & 68173824) != 0) {
            iCheckLogStatus = task != null ? task.checkLogStatus() : i7;
            long j14 = j2 & 16384;
            str4 = string3;
            if (j14 != 0) {
                z2 = iCheckLogStatus == 2;
                if (j14 != 0) {
                    j2 = z2 ? j2 | 33554432 : j2 | 16777216;
                }
            } else {
                z2 = false;
            }
            if ((j2 & 68157440) != 0) {
                z3 = iCheckLogStatus == 3;
                if ((j2 & 67108864) != 0) {
                    j2 |= z3 ? 524288L : 262144L;
                }
                if ((j2 & 67108864) != 0) {
                    if (z3) {
                        textView = this.f32450t;
                        i11 = R.color.sub_title_color;
                    } else {
                        textView = this.f32450t;
                        i11 = R.color.white_light;
                    }
                    iM388d = ViewDataBinding.m388d(textView, i11);
                    iCheckLogStatus = iCheckLogStatus;
                    j2 = j2;
                    j4 = 3;
                } else {
                    iM388d = 0;
                    j4 = 3;
                }
            } else {
                i7 = iCheckLogStatus;
            }
            j5 = j2 & j4;
            if (j5 != 0) {
                if (z) {
                    z3 = true;
                }
                if (z) {
                    iM388d = ViewDataBinding.m388d(this.f32450t, R.color.header_color);
                }
                if (j5 != 0) {
                    if (z3) {
                        j9 = 131072;
                    } else {
                        j9 = 65536;
                    }
                    j2 |= j9;
                }
                if (z3) {
                    context = this.f32450t.getContext();
                    i10 = R.drawable.bg_button_gray_basic_corners;
                } else {
                    context = this.f32450t.getContext();
                    i10 = R.drawable.bg_button_basic_corners;
                }
                drawableM14707b = AppCompatResources.m14707b(context, i10);
                i8 = iM388d;
            } else {
                str2 = str2;
                i6 = i6;
                drawableM14707b = null;
                i8 = 0;
            }
            j6 = j2 & 16777216;
            if (j6 != 0) {
                if (iCheckLogStatus == 4) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (j6 != 0) {
                    if (z4) {
                        j8 = 8192;
                    } else {
                        j8 = 4096;
                    }
                    j2 |= j8;
                }
                Resources resources2 = this.f32450t.getResources();
                if (z4) {
                    i9 = R.string.text_continue;
                } else {
                    i9 = R.string.txt_collected;
                }
                string4 = resources2.getString(i9);
            } else {
                string4 = null;
            }
            if ((16384 & j2) != 0) {
                string4 = null;
            } else if (z2) {
                string4 = this.f32450t.getResources().getString(R.string.txt_collect);
            }
            j7 = j2 & 3;
            if (j7 != 0) {
                string4 = null;
            } else if (z) {
                string4 = str4;
            }
            if (j7 != 0) {
                this.f32450t.setBackground(drawableM14707b);
                TextViewBindingAdapter.m16406a(this.f32450t, string4);
                this.f32450t.setTextColor(i8);
                appCompatImageView = this.f32451u;
                Intrinsics2.m13089e(appCompatImageView, "$this$taskBackground");
                switch (id) {
                    case 2:
                        appCompatImageView.setBackground(appCompatImageView.getResources().getDrawable(R.drawable.ic_task_reward));
                        break;
                    case 3:
                        appCompatImageView.setBackground(appCompatImageView.getResources().getDrawable(R.drawable.ic_task_post));
                        break;
                    case 4:
                        appCompatImageView.setBackground(appCompatImageView.getResources().getDrawable(R.drawable.ic_task_like));
                        break;
                    case 5:
                        appCompatImageView.setBackground(appCompatImageView.getResources().getDrawable(R.drawable.ic_task_share));
                        break;
                    case 6:
                        appCompatImageView.setBackground(appCompatImageView.getResources().getDrawable(R.drawable.ic_task_comment));
                        break;
                    case 7:
                        appCompatImageView.setBackground(appCompatImageView.getResources().getDrawable(R.drawable.ic_task_gift));
                        break;
                }
                this.f32481A.setVisibility(i2);
                TextViewBindingAdapter.m16406a(this.f32482B, string);
                this.f32482B.setVisibility(i);
                this.f32483C.setVisibility(i5);
                TextViewBindingAdapter.m16406a(this.f32483C, strM1590l);
                TextViewBindingAdapter.m16406a(this.f32484D, str);
                TextViewBindingAdapter.m16406a(this.f32485E, str3);
                TextViewBindingAdapter.m16406a(this.f32486F, string2);
                int i15 = i6;
                this.f32487G.setVisibility(i15);
                TextViewBindingAdapter.m16406a(this.f32488H, str2);
                this.f32488H.setVisibility(i15);
                this.f32489I.setVisibility(i);
                this.f32453w.setVisibility(i4);
            }
        }
        str4 = string3;
        z2 = false;
        z3 = false;
        iCheckLogStatus = i7;
        iM388d = 0;
        j4 = 3;
        j5 = j2 & j4;
        if (j5 != 0) {
            if (z) {
                z3 = true;
            }
            if (z) {
                iM388d = ViewDataBinding.m388d(this.f32450t, R.color.header_color);
            }
            if (j5 != 0) {
                if (z3) {
                    j9 = 131072;
                } else {
                    j9 = 65536;
                }
                j2 |= j9;
            }
            if (z3) {
                context = this.f32450t.getContext();
                i10 = R.drawable.bg_button_gray_basic_corners;
            } else {
                context = this.f32450t.getContext();
                i10 = R.drawable.bg_button_basic_corners;
            }
            drawableM14707b = AppCompatResources.m14707b(context, i10);
            i8 = iM388d;
        } else {
            str2 = str2;
            i6 = i6;
            drawableM14707b = null;
            i8 = 0;
        }
        j6 = j2 & 16777216;
        if (j6 != 0) {
            if (iCheckLogStatus == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (j6 != 0) {
                if (z4) {
                    j8 = 8192;
                } else {
                    j8 = 4096;
                }
                j2 |= j8;
            }
            Resources resources3 = this.f32450t.getResources();
            if (z4) {
                i9 = R.string.text_continue;
            } else {
                i9 = R.string.txt_collected;
            }
            string4 = resources3.getString(i9);
        } else {
            string4 = null;
        }
        if ((16384 & j2) != 0) {
            string4 = null;
        } else if (z2) {
            string4 = this.f32450t.getResources().getString(R.string.txt_collect);
        }
        j7 = j2 & 3;
        if (j7 != 0) {
            string4 = null;
        } else if (z) {
            string4 = str4;
        }
        if (j7 != 0) {
            this.f32450t.setBackground(drawableM14707b);
            TextViewBindingAdapter.m16406a(this.f32450t, string4);
            this.f32450t.setTextColor(i8);
            appCompatImageView = this.f32451u;
            Intrinsics2.m13089e(appCompatImageView, "$this$taskBackground");
            switch (id) {
                case 2:
                    appCompatImageView.setBackground(appCompatImageView.getResources().getDrawable(R.drawable.ic_task_reward));
                    break;
                case 3:
                    appCompatImageView.setBackground(appCompatImageView.getResources().getDrawable(R.drawable.ic_task_post));
                    break;
                case 4:
                    appCompatImageView.setBackground(appCompatImageView.getResources().getDrawable(R.drawable.ic_task_like));
                    break;
                case 5:
                    appCompatImageView.setBackground(appCompatImageView.getResources().getDrawable(R.drawable.ic_task_share));
                    break;
                case 6:
                    appCompatImageView.setBackground(appCompatImageView.getResources().getDrawable(R.drawable.ic_task_comment));
                    break;
                case 7:
                    appCompatImageView.setBackground(appCompatImageView.getResources().getDrawable(R.drawable.ic_task_gift));
                    break;
            }
            this.f32481A.setVisibility(i2);
            TextViewBindingAdapter.m16406a(this.f32482B, string);
            this.f32482B.setVisibility(i);
            this.f32483C.setVisibility(i5);
            TextViewBindingAdapter.m16406a(this.f32483C, strM1590l);
            TextViewBindingAdapter.m16406a(this.f32484D, str);
            TextViewBindingAdapter.m16406a(this.f32485E, str3);
            TextViewBindingAdapter.m16406a(this.f32486F, string2);
            int i16 = i6;
            this.f32487G.setVisibility(i16);
            TextViewBindingAdapter.m16406a(this.f32488H, str2);
            this.f32488H.setVisibility(i16);
            this.f32489I.setVisibility(i);
            this.f32453w.setVisibility(i4);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: e */
    public boolean mo397e() {
        synchronized (this) {
            return this.f32490J != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    /* JADX INFO: renamed from: f */
    public void mo398f() {
        synchronized (this) {
            this.f32490J = 2L;
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
        this.f32454x = (Task) obj;
        synchronized (this) {
            this.f32490J |= 1;
        }
        m16396a(8);
        m401m();
        return true;
    }
}
