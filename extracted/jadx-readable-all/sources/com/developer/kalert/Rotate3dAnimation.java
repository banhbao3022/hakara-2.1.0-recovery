package com.developer.kalert;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Camera;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: loaded from: classes.dex */
public class Rotate3dAnimation extends Animation {
    private static final int ROLL_BY_X = 0;
    private static final int ROLL_BY_Y = 1;
    private static final int ROLL_BY_Z = 2;
    private Camera camera;
    private final float fromDegrees;
    private int mPivotXType;
    private float mPivotXValue;
    private int mPivotYType;
    private float mPivotYValue;
    private float pivotX;
    private float pivotY;
    private final int rollType;
    private final float toDegrees;

    public static class Description {
        public int type;
        public float value;
    }

    public Rotate3dAnimation(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mPivotXType = 0;
        this.mPivotYType = 0;
        this.mPivotXValue = 0.0f;
        this.mPivotYValue = 0.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5801R.styleable.Rotate3dAnimation);
        this.fromDegrees = typedArrayObtainStyledAttributes.getFloat(C5801R.styleable.Rotate3dAnimation_fromDeg, 0.0f);
        this.toDegrees = typedArrayObtainStyledAttributes.getFloat(C5801R.styleable.Rotate3dAnimation_toDeg, 0.0f);
        this.rollType = typedArrayObtainStyledAttributes.getInt(C5801R.styleable.Rotate3dAnimation_rollType, 0);
        Description value = parseValue(typedArrayObtainStyledAttributes.peekValue(C5801R.styleable.Rotate3dAnimation_pivotX));
        this.mPivotXType = value.type;
        this.mPivotXValue = value.value;
        Description value2 = parseValue(typedArrayObtainStyledAttributes.peekValue(C5801R.styleable.Rotate3dAnimation_pivotY));
        this.mPivotYType = value2.type;
        this.mPivotYValue = value2.value;
        typedArrayObtainStyledAttributes.recycle();
        initializePivotPoint();
    }

    private void initializePivotPoint() {
        if (this.mPivotXType == 0) {
            this.pivotX = this.mPivotXValue;
        }
        if (this.mPivotYType == 0) {
            this.pivotY = this.mPivotYValue;
        }
    }

    private Description parseValue(TypedValue typedValue) {
        Description description = new Description();
        if (typedValue == null) {
            description.type = 0;
            description.value = 0.0f;
        } else {
            int i = typedValue.type;
            if (i == 6) {
                int i2 = typedValue.data;
                description.type = (i2 & 15) == 1 ? 2 : 1;
                description.value = TypedValue.complexToFloat(i2);
                return description;
            }
            if (i == 4) {
                description.type = 0;
                description.value = typedValue.getFloat();
                return description;
            }
            if (i >= 16 && i <= 31) {
                description.type = 0;
                description.value = typedValue.data;
                return description;
            }
        }
        description.type = 0;
        description.value = 0.0f;
        return description;
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f, Transformation transformation) {
        float f2 = this.fromDegrees;
        float fM1576a = outline.m1576a(this.toDegrees, f2, f, f2);
        Matrix matrix = transformation.getMatrix();
        this.camera.save();
        int i = this.rollType;
        if (i == 0) {
            this.camera.rotateX(fM1576a);
        } else if (i == 1) {
            this.camera.rotateY(fM1576a);
        } else if (i == 2) {
            this.camera.rotateZ(fM1576a);
        }
        this.camera.getMatrix(matrix);
        this.camera.restore();
        matrix.preTranslate(-this.pivotX, -this.pivotY);
        matrix.postTranslate(this.pivotX, this.pivotY);
    }

    @Override // android.view.animation.Animation
    public void initialize(int i, int i2, int i3, int i4) {
        super.initialize(i, i2, i3, i4);
        this.camera = new Camera();
        this.pivotX = resolveSize(this.mPivotXType, this.mPivotXValue, i, i3);
        this.pivotY = resolveSize(this.mPivotYType, this.mPivotYValue, i2, i4);
    }

    public Rotate3dAnimation(int i, float f, float f2) {
        this.mPivotXType = 0;
        this.mPivotYType = 0;
        this.mPivotXValue = 0.0f;
        this.mPivotYValue = 0.0f;
        this.rollType = i;
        this.fromDegrees = f;
        this.toDegrees = f2;
        this.pivotX = 0.0f;
        this.pivotY = 0.0f;
    }

    public Rotate3dAnimation(int i, float f, float f2, float f3, float f4) {
        this.mPivotXType = 0;
        this.mPivotYType = 0;
        this.mPivotXValue = 0.0f;
        this.mPivotYValue = 0.0f;
        this.rollType = i;
        this.fromDegrees = f;
        this.toDegrees = f2;
        this.mPivotXType = 0;
        this.mPivotYType = 0;
        this.mPivotXValue = f3;
        this.mPivotYValue = f4;
        initializePivotPoint();
    }

    public Rotate3dAnimation(int i, float f, float f2, int i2, float f3, int i3, float f4) {
        this.mPivotXType = 0;
        this.mPivotYType = 0;
        this.mPivotXValue = 0.0f;
        this.mPivotYValue = 0.0f;
        this.rollType = i;
        this.fromDegrees = f;
        this.toDegrees = f2;
        this.mPivotXValue = f3;
        this.mPivotXType = i2;
        this.mPivotYValue = f4;
        this.mPivotYType = i3;
        initializePivotPoint();
    }
}
