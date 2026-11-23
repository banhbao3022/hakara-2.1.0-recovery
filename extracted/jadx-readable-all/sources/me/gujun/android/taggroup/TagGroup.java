package me.gujun.android.taggroup;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.ArrowKeyMovementMethod;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import mtp.media.karaoke.R;
import p505f1.p506a.p507a.p508a.C6327a;

/* JADX INFO: loaded from: classes.dex */
public class TagGroup extends ViewGroup {

    /* JADX INFO: renamed from: A */
    public int f33311A;

    /* JADX INFO: renamed from: B */
    public int f33312B;

    /* JADX INFO: renamed from: C */
    public int f33313C;

    /* JADX INFO: renamed from: D */
    public int f33314D;

    /* JADX INFO: renamed from: E */
    public int f33315E;

    /* JADX INFO: renamed from: F */
    public int f33316F;

    /* JADX INFO: renamed from: G */
    public float f33317G;

    /* JADX INFO: renamed from: H */
    public float f33318H;

    /* JADX INFO: renamed from: I */
    public int f33319I;

    /* JADX INFO: renamed from: J */
    public int f33320J;

    /* JADX INFO: renamed from: K */
    public int f33321K;

    /* JADX INFO: renamed from: L */
    public int f33322L;

    /* JADX INFO: renamed from: M */
    public InterfaceC7225d f33323M;

    /* JADX INFO: renamed from: N */
    public InterfaceC7226e f33324N;

    /* JADX INFO: renamed from: O */
    public ViewOnClickListenerC7223b f33325O;

    /* JADX INFO: renamed from: f */
    public final int f33326f;

    /* JADX INFO: renamed from: g */
    public final int f33327g;

    /* JADX INFO: renamed from: h */
    public final int f33328h;

    /* JADX INFO: renamed from: i */
    public final int f33329i;

    /* JADX INFO: renamed from: j */
    public final int f33330j;

    /* JADX INFO: renamed from: k */
    public final int f33331k;

    /* JADX INFO: renamed from: l */
    public final int f33332l;

    /* JADX INFO: renamed from: m */
    public final int f33333m;

    /* JADX INFO: renamed from: n */
    public final float f33334n;

    /* JADX INFO: renamed from: o */
    public final float f33335o;

    /* JADX INFO: renamed from: p */
    public final float f33336p;

    /* JADX INFO: renamed from: q */
    public final float f33337q;

    /* JADX INFO: renamed from: r */
    public final float f33338r;

    /* JADX INFO: renamed from: s */
    public final float f33339s;

    /* JADX INFO: renamed from: t */
    public boolean f33340t;

    /* JADX INFO: renamed from: u */
    public CharSequence f33341u;

    /* JADX INFO: renamed from: v */
    public int f33342v;

    /* JADX INFO: renamed from: w */
    public int f33343w;

    /* JADX INFO: renamed from: x */
    public int f33344x;

    /* JADX INFO: renamed from: y */
    public int f33345y;

    /* JADX INFO: renamed from: z */
    public int f33346z;

    /* JADX INFO: renamed from: me.gujun.android.taggroup.TagGroup$a */
    public class ViewOnClickListenerC7222a implements View.OnClickListener {
        public ViewOnClickListenerC7222a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TagGroup tagGroup = TagGroup.this;
            C7228g inputTag = tagGroup.getInputTag();
            if (inputTag == null || !inputTag.m14324c()) {
                return;
            }
            inputTag.m14322a();
            InterfaceC7225d interfaceC7225d = tagGroup.f33323M;
            if (interfaceC7225d != null) {
                interfaceC7225d.m14319a(tagGroup, inputTag.getText().toString());
            }
            tagGroup.m14316a();
        }
    }

    /* JADX INFO: renamed from: me.gujun.android.taggroup.TagGroup$b */
    public class ViewOnClickListenerC7223b implements View.OnClickListener {
        public ViewOnClickListenerC7223b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C7228g c7228g = (C7228g) view;
            TagGroup tagGroup = TagGroup.this;
            if (!tagGroup.f33340t) {
                InterfaceC7226e interfaceC7226e = tagGroup.f33324N;
                if (interfaceC7226e != null) {
                    interfaceC7226e.mo14321a(c7228g.getText().toString());
                    return;
                }
                return;
            }
            if (c7228g.f33353f == 2) {
                C7228g checkedTag = tagGroup.getCheckedTag();
                if (checkedTag != null) {
                    checkedTag.m14325d(false);
                    return;
                }
                return;
            }
            if (!c7228g.f33354g) {
                C7228g checkedTag2 = tagGroup.getCheckedTag();
                if (checkedTag2 != null) {
                    checkedTag2.m14325d(false);
                }
                c7228g.m14325d(true);
                return;
            }
            tagGroup.removeView(c7228g);
            InterfaceC7225d interfaceC7225d = tagGroup.f33323M;
            if (interfaceC7225d != null) {
                interfaceC7225d.m14320b(tagGroup, c7228g.getText().toString());
            }
        }
    }

    /* JADX INFO: renamed from: me.gujun.android.taggroup.TagGroup$c */
    public static class C7224c extends ViewGroup.LayoutParams {
        public C7224c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C7224c(int i, int i2) {
            super(i, i2);
        }
    }

    /* JADX INFO: renamed from: me.gujun.android.taggroup.TagGroup$d */
    public interface InterfaceC7225d {
        /* JADX INFO: renamed from: a */
        void m14319a(TagGroup tagGroup, String str);

        /* JADX INFO: renamed from: b */
        void m14320b(TagGroup tagGroup, String str);
    }

    /* JADX INFO: renamed from: me.gujun.android.taggroup.TagGroup$e */
    public interface InterfaceC7226e {
        /* JADX INFO: renamed from: a */
        void mo14321a(String str);
    }

    /* JADX INFO: renamed from: me.gujun.android.taggroup.TagGroup$g */
    public class C7228g extends TextView {

        /* JADX INFO: renamed from: f */
        public int f33353f;

        /* JADX INFO: renamed from: g */
        public boolean f33354g;

        /* JADX INFO: renamed from: h */
        public boolean f33355h;

        /* JADX INFO: renamed from: i */
        public Paint f33356i;

        /* JADX INFO: renamed from: j */
        public Paint f33357j;

        /* JADX INFO: renamed from: k */
        public Paint f33358k;

        /* JADX INFO: renamed from: l */
        public RectF f33359l;

        /* JADX INFO: renamed from: m */
        public RectF f33360m;

        /* JADX INFO: renamed from: n */
        public RectF f33361n;

        /* JADX INFO: renamed from: o */
        public RectF f33362o;

        /* JADX INFO: renamed from: p */
        public RectF f33363p;

        /* JADX INFO: renamed from: q */
        public Rect f33364q;

        /* JADX INFO: renamed from: r */
        public Path f33365r;

        /* JADX INFO: renamed from: s */
        public PathEffect f33366s;

        /* JADX INFO: renamed from: me.gujun.android.taggroup.TagGroup$g$a */
        public class a implements View.OnLongClickListener {

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ int f33368f;

            public a(C7228g c7228g, TagGroup tagGroup, int i) {
                this.f33368f = i;
            }

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                return this.f33368f != 2;
            }
        }

        /* JADX INFO: renamed from: me.gujun.android.taggroup.TagGroup$g$b */
        public class b implements TextView.OnEditorActionListener {
            public b(TagGroup tagGroup) {
            }

            @Override // android.widget.TextView.OnEditorActionListener
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i != 0 || keyEvent == null || keyEvent.getKeyCode() != 66 || keyEvent.getAction() != 0) {
                    return false;
                }
                if (!C7228g.this.m14324c()) {
                    return true;
                }
                C7228g.this.m14322a();
                C7228g c7228g = C7228g.this;
                TagGroup tagGroup = TagGroup.this;
                InterfaceC7225d interfaceC7225d = tagGroup.f33323M;
                if (interfaceC7225d != null) {
                    interfaceC7225d.m14319a(tagGroup, c7228g.getText().toString());
                }
                TagGroup.this.m14316a();
                return true;
            }
        }

        /* JADX INFO: renamed from: me.gujun.android.taggroup.TagGroup$g$c */
        public class c implements View.OnKeyListener {
            public c(TagGroup tagGroup) {
            }

            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                C7228g lastNormalTagView;
                if (i != 67 || keyEvent.getAction() != 0 || !TextUtils.isEmpty(C7228g.this.getText().toString()) || (lastNormalTagView = TagGroup.this.getLastNormalTagView()) == null) {
                    return false;
                }
                if (lastNormalTagView.f33354g) {
                    TagGroup.this.removeView(lastNormalTagView);
                    TagGroup tagGroup = TagGroup.this;
                    InterfaceC7225d interfaceC7225d = tagGroup.f33323M;
                    if (interfaceC7225d != null) {
                        interfaceC7225d.m14320b(tagGroup, lastNormalTagView.getText().toString());
                    }
                } else {
                    C7228g checkedTag = TagGroup.this.getCheckedTag();
                    if (checkedTag != null) {
                        checkedTag.m14325d(false);
                    }
                    lastNormalTagView.m14325d(true);
                }
                return true;
            }
        }

        /* JADX INFO: renamed from: me.gujun.android.taggroup.TagGroup$g$d */
        public class d implements TextWatcher {
            public d(TagGroup tagGroup) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                C7228g checkedTag = TagGroup.this.getCheckedTag();
                if (checkedTag != null) {
                    checkedTag.m14325d(false);
                }
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        }

        /* JADX INFO: renamed from: me.gujun.android.taggroup.TagGroup$g$e */
        public class e extends InputConnectionWrapper {
            public e(C7228g c7228g, InputConnection inputConnection, boolean z) {
                super(inputConnection, z);
            }

            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public boolean deleteSurroundingText(int i, int i2) {
                if (i == 1 && i2 == 0) {
                    return sendKeyEvent(new KeyEvent(0, 67)) && sendKeyEvent(new KeyEvent(1, 67));
                }
                return super.deleteSurroundingText(i, i2);
            }
        }

        public C7228g(Context context, int i, CharSequence charSequence) {
            super(context);
            this.f33354g = false;
            this.f33355h = false;
            this.f33356i = new Paint(1);
            this.f33357j = new Paint(1);
            this.f33358k = new Paint(1);
            this.f33359l = new RectF();
            this.f33360m = new RectF();
            this.f33361n = new RectF();
            this.f33362o = new RectF();
            this.f33363p = new RectF();
            this.f33364q = new Rect();
            this.f33365r = new Path();
            this.f33366s = new DashPathEffect(new float[]{10.0f, 5.0f}, 0.0f);
            this.f33356i.setStyle(Paint.Style.STROKE);
            this.f33356i.setStrokeWidth(TagGroup.this.f33317G);
            this.f33357j.setStyle(Paint.Style.FILL);
            this.f33358k.setStyle(Paint.Style.FILL);
            this.f33358k.setStrokeWidth(4.0f);
            this.f33358k.setColor(TagGroup.this.f33314D);
            int i2 = TagGroup.this.f33321K;
            int i3 = TagGroup.this.f33322L;
            setPadding(i2, i3, i2, i3);
            setLayoutParams(new C7224c(-2, -2));
            setGravity(17);
            setText(charSequence);
            setTextSize(0, TagGroup.this.f33318H);
            this.f33353f = i;
            setClickable(TagGroup.this.f33340t);
            setFocusable(i == 2);
            setFocusableInTouchMode(i == 2);
            setHint(i == 2 ? TagGroup.this.f33341u : null);
            setMovementMethod(i == 2 ? ArrowKeyMovementMethod.getInstance() : null);
            setOnLongClickListener(new a(this, TagGroup.this, i));
            if (i == 2) {
                requestFocus();
                setOnEditorActionListener(new b(TagGroup.this));
                setOnKeyListener(new c(TagGroup.this));
                addTextChangedListener(new d(TagGroup.this));
            }
            m14323b();
        }

        /* JADX INFO: renamed from: a */
        public void m14322a() {
            setFocusable(false);
            setFocusableInTouchMode(false);
            setHint((CharSequence) null);
            setMovementMethod(null);
            this.f33353f = 1;
            m14323b();
            requestLayout();
        }

        /* JADX INFO: renamed from: b */
        public final void m14323b() {
            TagGroup tagGroup = TagGroup.this;
            if (!tagGroup.f33340t) {
                this.f33356i.setColor(tagGroup.f33342v);
                this.f33357j.setColor(TagGroup.this.f33344x);
                setTextColor(TagGroup.this.f33343w);
            } else if (this.f33353f == 2) {
                this.f33356i.setColor(tagGroup.f33345y);
                this.f33356i.setPathEffect(this.f33366s);
                this.f33357j.setColor(TagGroup.this.f33344x);
                setHintTextColor(TagGroup.this.f33346z);
                setTextColor(TagGroup.this.f33311A);
            } else {
                this.f33356i.setPathEffect(null);
                if (this.f33354g) {
                    this.f33356i.setColor(TagGroup.this.f33312B);
                    this.f33357j.setColor(TagGroup.this.f33315E);
                    setTextColor(TagGroup.this.f33313C);
                } else {
                    this.f33356i.setColor(TagGroup.this.f33342v);
                    this.f33357j.setColor(TagGroup.this.f33344x);
                    setTextColor(TagGroup.this.f33343w);
                }
            }
            if (this.f33355h) {
                this.f33357j.setColor(TagGroup.this.f33316F);
            }
        }

        /* JADX INFO: renamed from: c */
        public boolean m14324c() {
            return getText() != null && getText().length() > 0;
        }

        /* JADX INFO: renamed from: d */
        public void m14325d(boolean z) {
            int height;
            this.f33354g = z;
            TagGroup tagGroup = TagGroup.this;
            int i = tagGroup.f33321K;
            int i2 = tagGroup.f33322L;
            if (z) {
                height = (int) ((getHeight() / 2.5f) + i + 3.0f);
            } else {
                height = i;
            }
            setPadding(i, i2, height, TagGroup.this.f33322L);
            m14323b();
        }

        @Override // android.widget.TextView
        public boolean getDefaultEditable() {
            return true;
        }

        @Override // android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            return new e(this, super.onCreateInputConnection(editorInfo), true);
        }

        @Override // android.widget.TextView, android.view.View
        public void onDraw(Canvas canvas) {
            canvas.drawArc(this.f33359l, -180.0f, 90.0f, true, this.f33357j);
            canvas.drawArc(this.f33359l, -270.0f, 90.0f, true, this.f33357j);
            canvas.drawArc(this.f33360m, -90.0f, 90.0f, true, this.f33357j);
            canvas.drawArc(this.f33360m, 0.0f, 90.0f, true, this.f33357j);
            canvas.drawRect(this.f33361n, this.f33357j);
            canvas.drawRect(this.f33362o, this.f33357j);
            if (this.f33354g) {
                canvas.save();
                canvas.rotate(45.0f, this.f33363p.centerX(), this.f33363p.centerY());
                RectF rectF = this.f33363p;
                float f = rectF.left;
                float fCenterY = rectF.centerY();
                RectF rectF2 = this.f33363p;
                canvas.drawLine(f, fCenterY, rectF2.right, rectF2.centerY(), this.f33358k);
                float fCenterX = this.f33363p.centerX();
                RectF rectF3 = this.f33363p;
                canvas.drawLine(fCenterX, rectF3.top, rectF3.centerX(), this.f33363p.bottom, this.f33358k);
                canvas.restore();
            }
            canvas.drawPath(this.f33365r, this.f33356i);
            super.onDraw(canvas);
        }

        @Override // android.view.View
        public void onSizeChanged(int i, int i2, int i3, int i4) {
            super.onSizeChanged(i, i2, i3, i4);
            float f = TagGroup.this.f33317G;
            int i5 = (int) f;
            int i6 = (int) f;
            int i7 = (int) ((i + i5) - (f * 2.0f));
            int i8 = (int) ((i6 + i2) - (f * 2.0f));
            int i9 = i8 - i6;
            float f2 = i5;
            float f3 = i6;
            float f4 = i6 + i9;
            this.f33359l.set(f2, f3, i5 + i9, f4);
            float f5 = i7;
            this.f33360m.set(i7 - i9, f3, f5, f4);
            this.f33365r.reset();
            this.f33365r.addArc(this.f33359l, -180.0f, 90.0f);
            this.f33365r.addArc(this.f33359l, -270.0f, 90.0f);
            this.f33365r.addArc(this.f33360m, -90.0f, 90.0f);
            this.f33365r.addArc(this.f33360m, 0.0f, 90.0f);
            float f6 = i9;
            int i10 = (int) (f6 / 2.0f);
            float f7 = i5 + i10;
            this.f33365r.moveTo(f7, f3);
            float f8 = i7 - i10;
            this.f33365r.lineTo(f8, f3);
            float f9 = i8;
            this.f33365r.moveTo(f7, f9);
            this.f33365r.lineTo(f8, f9);
            float f10 = i6 + i10;
            this.f33365r.moveTo(f2, f10);
            float f11 = i8 - i10;
            this.f33365r.lineTo(f2, f11);
            this.f33365r.moveTo(f5, f10);
            this.f33365r.lineTo(f5, f11);
            this.f33361n.set(f2, f10, f5, f11);
            this.f33362o.set(f7, f3, f8, f9);
            int i11 = (int) (i2 / 2.5f);
            RectF rectF = this.f33363p;
            int i12 = TagGroup.this.f33321K;
            float f12 = ((i7 - i11) - i12) + 3;
            int i13 = i9 / 2;
            int i14 = i11 / 2;
            rectF.set(f12, (i6 + i13) - i14, (i7 - i12) + 3, (i8 - i13) + i14);
            if (this.f33354g) {
                TagGroup tagGroup = TagGroup.this;
                int i15 = tagGroup.f33321K;
                int i16 = tagGroup.f33322L;
                setPadding(i15, i16, (int) ((f6 / 2.5f) + i15 + 3.0f), i16);
            }
        }

        @Override // android.widget.TextView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (this.f33353f == 2) {
                return super.onTouchEvent(motionEvent);
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                getDrawingRect(this.f33364q);
                this.f33355h = true;
                m14323b();
                invalidate();
            } else if (action == 1) {
                this.f33355h = false;
                m14323b();
                invalidate();
            } else if (action == 2 && !this.f33364q.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                this.f33355h = false;
                m14323b();
                invalidate();
            }
            return super.onTouchEvent(motionEvent);
        }
    }

    public TagGroup(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public void m14316a() {
        if (getInputTag() != null) {
            throw new IllegalStateException("Already has a INPUT tag in group.");
        }
        C7228g c7228g = new C7228g(getContext(), 2, null);
        c7228g.setOnClickListener(this.f33325O);
        addView(c7228g);
    }

    /* JADX INFO: renamed from: b */
    public float m14317b(float f) {
        return TypedValue.applyDimension(1, f, getResources().getDisplayMetrics());
    }

    /* JADX INFO: renamed from: c */
    public C7228g m14318c(int i) {
        return (C7228g) getChildAt(i);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C7224c(getContext(), attributeSet);
    }

    public C7228g getCheckedTag() {
        int checkedTagIndex = getCheckedTagIndex();
        if (checkedTagIndex != -1) {
            return m14318c(checkedTagIndex);
        }
        return null;
    }

    public int getCheckedTagIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (m14318c(i).f33354g) {
                return i;
            }
        }
        return -1;
    }

    public C7228g getInputTag() {
        C7228g c7228gM14318c;
        if (this.f33340t && (c7228gM14318c = m14318c(getChildCount() - 1)) != null && c7228gM14318c.f33353f == 2) {
            return c7228gM14318c;
        }
        return null;
    }

    public String getInputTagText() {
        C7228g inputTag = getInputTag();
        if (inputTag != null) {
            return inputTag.getText().toString();
        }
        return null;
    }

    public C7228g getLastNormalTagView() {
        return m14318c(this.f33340t ? getChildCount() - 2 : getChildCount() - 1);
    }

    public String[] getTags() {
        int childCount = getChildCount();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < childCount; i++) {
            C7228g c7228gM14318c = m14318c(i);
            if (c7228gM14318c.f33353f == 1) {
                arrayList.add(c7228gM14318c.getText().toString());
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int paddingRight = (i3 - i) - getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        int childCount = getChildCount();
        int i5 = paddingLeft;
        int iMax = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            if (childAt.getVisibility() != 8) {
                if (i5 + measuredWidth > paddingRight) {
                    paddingTop += iMax + this.f33320J;
                    i5 = paddingLeft;
                    iMax = measuredHeight;
                } else {
                    iMax = Math.max(iMax, measuredHeight);
                }
                childAt.layout(i5, paddingTop, i5 + measuredWidth, measuredHeight + paddingTop);
                i5 += measuredWidth + this.f33319I;
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        measureChildren(i, i2);
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            if (childAt.getVisibility() != 8) {
                int i8 = i6 + measuredWidth;
                if (i8 > size) {
                    i3 += i4 + this.f33320J;
                    i5++;
                } else {
                    measuredHeight = Math.max(i4, measuredHeight);
                    measuredWidth = i8;
                }
                i6 = measuredWidth + this.f33319I;
                i4 = measuredHeight;
            }
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop() + i3 + i4;
        int paddingRight = i5 == 0 ? getPaddingRight() + getPaddingLeft() + i6 : size;
        if (mode != 1073741824) {
            size = paddingRight;
        }
        if (mode2 != 1073741824) {
            size2 = paddingBottom;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C7227f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C7227f c7227f = (C7227f) parcelable;
        super.onRestoreInstanceState(c7227f.getSuperState());
        setTags(c7227f.f33350g);
        C7228g c7228gM14318c = m14318c(c7227f.f33351h);
        if (c7228gM14318c != null) {
            c7228gM14318c.m14325d(true);
        }
        if (getInputTag() != null) {
            getInputTag().setText(c7227f.f33352i);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C7227f c7227f = new C7227f(super.onSaveInstanceState());
        c7227f.f33350g = getTags();
        c7227f.f33351h = getCheckedTagIndex();
        if (getInputTag() != null) {
            c7227f.f33352i = getInputTag().getText().toString();
        }
        return c7227f;
    }

    public void setOnTagChangeListener(InterfaceC7225d interfaceC7225d) {
        this.f33323M = interfaceC7225d;
    }

    public void setOnTagClickListener(InterfaceC7226e interfaceC7226e) {
        this.f33324N = interfaceC7226e;
    }

    public void setTags(List<String> list) {
        setTags((String[]) list.toArray(new String[list.size()]));
    }

    public TagGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.tagGroupStyle);
    }

    public void setTags(String... strArr) {
        removeAllViews();
        for (String str : strArr) {
            C7228g c7228g = new C7228g(getContext(), 1, str);
            c7228g.setOnClickListener(this.f33325O);
            addView(c7228g);
        }
        if (this.f33340t) {
            m14316a();
        }
    }

    public TagGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int iRgb = Color.rgb(73, 193, 32);
        this.f33326f = iRgb;
        int iRgb2 = Color.rgb(73, 193, 32);
        this.f33327g = iRgb2;
        int iRgb3 = Color.rgb(170, 170, 170);
        this.f33328h = iRgb3;
        int iArgb = Color.argb(128, 0, 0, 0);
        this.f33329i = iArgb;
        int iArgb2 = Color.argb(222, 0, 0, 0);
        this.f33330j = iArgb2;
        int iRgb4 = Color.rgb(73, 193, 32);
        this.f33331k = iRgb4;
        int iRgb5 = Color.rgb(73, 193, 32);
        this.f33332l = iRgb5;
        int iRgb6 = Color.rgb(237, 237, 237);
        this.f33333m = iRgb6;
        this.f33325O = new ViewOnClickListenerC7223b();
        float fM14317b = m14317b(0.5f);
        this.f33334n = fM14317b;
        float fApplyDimension = TypedValue.applyDimension(2, 13.0f, getResources().getDisplayMetrics());
        this.f33335o = fApplyDimension;
        float fM14317b2 = m14317b(8.0f);
        this.f33336p = fM14317b2;
        float fM14317b3 = m14317b(4.0f);
        this.f33337q = fM14317b3;
        float fM14317b4 = m14317b(12.0f);
        this.f33338r = fM14317b4;
        float fM14317b5 = m14317b(3.0f);
        this.f33339s = fM14317b5;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6327a.f29830a, i, R.style.TagGroup);
        try {
            this.f33340t = typedArrayObtainStyledAttributes.getBoolean(13, false);
            this.f33341u = typedArrayObtainStyledAttributes.getText(10);
            this.f33342v = typedArrayObtainStyledAttributes.getColor(1, iRgb);
            this.f33343w = typedArrayObtainStyledAttributes.getColor(15, iRgb2);
            this.f33344x = typedArrayObtainStyledAttributes.getColor(0, -1);
            this.f33345y = typedArrayObtainStyledAttributes.getColor(7, iRgb3);
            this.f33346z = typedArrayObtainStyledAttributes.getColor(11, iArgb);
            this.f33311A = typedArrayObtainStyledAttributes.getColor(12, iArgb2);
            this.f33312B = typedArrayObtainStyledAttributes.getColor(4, iRgb4);
            this.f33313C = typedArrayObtainStyledAttributes.getColor(6, -1);
            this.f33314D = typedArrayObtainStyledAttributes.getColor(5, -1);
            this.f33315E = typedArrayObtainStyledAttributes.getColor(3, iRgb5);
            this.f33316F = typedArrayObtainStyledAttributes.getColor(14, iRgb6);
            this.f33317G = typedArrayObtainStyledAttributes.getDimension(2, fM14317b);
            this.f33318H = typedArrayObtainStyledAttributes.getDimension(16, fApplyDimension);
            this.f33319I = (int) typedArrayObtainStyledAttributes.getDimension(9, fM14317b2);
            this.f33320J = (int) typedArrayObtainStyledAttributes.getDimension(18, fM14317b3);
            this.f33321K = (int) typedArrayObtainStyledAttributes.getDimension(8, fM14317b4);
            this.f33322L = (int) typedArrayObtainStyledAttributes.getDimension(17, fM14317b5);
            typedArrayObtainStyledAttributes.recycle();
            if (this.f33340t) {
                m14316a();
                setOnClickListener(new ViewOnClickListenerC7222a());
            }
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: me.gujun.android.taggroup.TagGroup$f */
    public static class C7227f extends View.BaseSavedState {
        public static final Parcelable.Creator<C7227f> CREATOR = new a();

        /* JADX INFO: renamed from: f */
        public int f33349f;

        /* JADX INFO: renamed from: g */
        public String[] f33350g;

        /* JADX INFO: renamed from: h */
        public int f33351h;

        /* JADX INFO: renamed from: i */
        public String f33352i;

        /* JADX INFO: renamed from: me.gujun.android.taggroup.TagGroup$f$a */
        public static class a implements Parcelable.Creator<C7227f> {
            @Override // android.os.Parcelable.Creator
            public C7227f createFromParcel(Parcel parcel) {
                return new C7227f(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public C7227f[] newArray(int i) {
                return new C7227f[i];
            }
        }

        public C7227f(Parcel parcel) {
            super(parcel);
            int i = parcel.readInt();
            this.f33349f = i;
            String[] strArr = new String[i];
            this.f33350g = strArr;
            parcel.readStringArray(strArr);
            this.f33351h = parcel.readInt();
            this.f33352i = parcel.readString();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            int length = this.f33350g.length;
            this.f33349f = length;
            parcel.writeInt(length);
            parcel.writeStringArray(this.f33350g);
            parcel.writeInt(this.f33351h);
            parcel.writeString(this.f33352i);
        }

        public C7227f(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
