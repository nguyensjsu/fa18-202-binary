// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;
import java.awt.Color;

/**
 * 
 */
public class CrabWorld extends World
{

    /* WARNING: This file is auto-generated and any changes to it will be overwritten*/

    /**
     * Initialize the World
     */
    public CrabWorld()
    {
        super(560 , 400 , 1);
        prepare ( );
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Crab crab = new Crab ( );
        addObject ( crab , 265 , 192 );
        showText ( "Lives: " + crab . getLives ( ) , 50 , 20 );
        /* John Ran*/
        showText ( "Worms: " + crab . getNumWorms ( ) , 160 , 20 );
        /* John Ran*/
        Worm worm = new Worm ( );
        addObject ( worm , 529 , 111 );
        Worm worm2 = new Worm ( );
        addObject ( worm2 , 512 , 277 );
        Worm worm3 = new Worm ( );
        addObject ( worm3 , 397 , 322 );
        Worm worm4 = new Worm ( );
        addObject ( worm4 , 425 , 148 );
        Worm worm5 = new Worm ( );
        addObject ( worm5 , 292 , 68 );
        Worm worm6 = new Worm ( );
        addObject ( worm6 , 154 , 106 );
        Worm worm7 = new Worm ( );
        addObject ( worm7 , 292 , 331 );
        Worm worm8 = new Worm ( );
        addObject ( worm8 , 164 , 357 );
        Worm worm9 = new Worm ( );
        addObject ( worm9 , 112 , 260 );
        Worm worm10 = new Worm ( );
        addObject ( worm10 , 87 , 38 );
        Lobster lobster = new Lobster ( 102 , 107 );
        /* added parameters*/
        addObject ( lobster , 102 , 107 );
        Lobster lobster2 = new Lobster ( 432 , 81 );
        /* added parameters*/
        addObject ( lobster2 , 432 , 81 );
        Lobster lobster3 = new Lobster ( 471 , 382 );
        /* added parameters*/
        addObject ( lobster3 , 471 , 382 );
        crab . attach ( lobster );
        /* John Ran*/
        crab . attach ( lobster2 );
        /* John Ran*/
        crab . attach ( lobster3 );
        /* John Ran*/
    }
}
